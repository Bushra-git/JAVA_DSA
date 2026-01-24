package functions;

import java.util.Scanner;

public class functions {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter r:");
        int r = sc.nextInt();

        System.out.println("nCr = " + nCr(n, r));
        sc.close();
    }
}