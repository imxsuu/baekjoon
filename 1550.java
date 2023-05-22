import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();
        int decimal = Integer.decode(hex);

        sc.close();
        System.out.println(decimal);
    }
}
