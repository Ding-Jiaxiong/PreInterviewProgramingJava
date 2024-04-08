package ArrayAndString.ArrayAndString1013;

import java.util.Scanner;

public class Main {

    public static boolean is_prime(int n) {

        if (n == 1) {
            return false;
        } else {

            for (int i = 2; i <= n - 1; i++) {

                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {

            if (is_prime(i)) {
                System.out.print(i + " ");
            }

        }

    }

}
