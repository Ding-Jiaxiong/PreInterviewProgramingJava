package NowCoder.ArrayAndString.ArrayAndString1022;

import java.util.Scanner;

/**
 * 规律题
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            long n = in.nextLong();  // n阶方阵

            System.out.println(((n / 2) * (n + 1) + 1) * ((n / 2) * (n + 1) + 1));

        }

    }

}
