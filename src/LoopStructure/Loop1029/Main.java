package LoopStructure.Loop1029;

import java.util.Scanner;

public class Main {

    public static boolean is_prime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            int n = in.nextInt();

            if (is_prime(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }

}
