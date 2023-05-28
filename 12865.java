import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
        
        // 1부터 n까지 저장하기 위해 배열 0번째 index를 버리고 n+1까지 생성
		int[][] dp = new int[n+1][k+1];
		int[] w =new int[n+1];
		int[] v = new int[n+1];
		
        // 물품의 수 조건: N(1 ≤ N ≤ 100)
		for(int i = 1; i <= n; i++) {			
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
        sc.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				dp[i][j] = dp[i-1][j]; // 기본적으로 이전 물품의 가치 저장
				if(j - w[i] >= 0) { // 허용 가능한 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면,
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); // 이전 물품의 가치 vs (남은 무게의 가치 + 자신의 가치) 중 큰 값을 선택
				}
			}
		}
		System.out.println(dp[n][k]);	
	}
}

