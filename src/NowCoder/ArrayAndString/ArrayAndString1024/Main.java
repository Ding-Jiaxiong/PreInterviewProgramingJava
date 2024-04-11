package NowCoder.ArrayAndString.ArrayAndString1024;

import java.util.Scanner;

/**
 * 这种就直接上String 数组, 别用二维char
 *
 * - Java 中next() 和 nextLine() 的区别
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] arr = new String[n + 10];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for (int i = 0; i < n; i++) {

            String str = "";

            for (int j = 0; j < n; j++) {

                str += arr[n - j - 1].charAt(i);
            }

            System.out.println(str);
        }

    }

}
