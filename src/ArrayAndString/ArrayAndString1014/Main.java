package ArrayAndString.ArrayAndString1014;

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

    public static int prime_num(int n) {

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (is_prime(i)) {
                ans++;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            int n = in.nextInt();

            System.out.println(prime_num(n));

        }
    }

}
