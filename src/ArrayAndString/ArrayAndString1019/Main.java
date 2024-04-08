package ArrayAndString.ArrayAndString1019;

import java.util.Scanner;

/**
 * 这道题就别想着再用一个二维数组存结果了, 结果中有数字有符号, 不好存的【当然好像存ASCII也行】
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        char[][] chars = new char[n + 10][m + 10]; // 多开防止越界

        for (int i = 1; i <= n; i++) {

            char[] chars1 = in.next().toCharArray();

            for (int j = 1; j <= m; j++) {

                chars[i][j] = chars1[j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int ray = 0;

                if (chars[i][j] != '*') {

                    if (chars[i - 1][j - 1] == '*') ray++;
                    if (chars[i - 1][j] == '*') ray++;
                    if (chars[i - 1][j + 1] == '*') ray++;
                    if (chars[i][j - 1] == '*') ray++;
                    if (chars[i][j + 1] == '*') ray++;
                    if (chars[i + 1][j] == '*') ray++;
                    if (chars[i + 1][j - 1] == '*') ray++;
                    if (chars[i + 1][j + 1] == '*') ray++;

                    System.out.print(ray);

                } else {
                    System.out.print('*');
                }

            }

            System.out.println();
        }

    }

}
