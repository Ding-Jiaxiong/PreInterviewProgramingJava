package NowCoder.ArrayAndString.ArrayAndString1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] ints = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                ints[i][j] = in.nextInt();
            }

        }

        boolean flag = true;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // 对角线往下的元素都是 i > j 的
                if (i > j) {
                    if (ints[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }

            }

        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
