package NowCoder.ArrayAndString.ArrayAndString1021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] ints = new int[n + 10][m + 10];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                ints[i][j] = in.nextInt(); // 多开防止数组越界
            }
        }

        // 矩阵转置
        int[][] ints_T = new int[n + 10][m + 10];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                ints_T[j][i] = ints[i][j];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(ints_T[i][j] + " ");
            }

            System.out.println();
        }

    }

}
