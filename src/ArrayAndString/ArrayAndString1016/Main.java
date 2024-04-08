package ArrayAndString.ArrayAndString1016;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 规律杨辉三角

        // 二维数组
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {  // 控制行数

            for (int j = 0; j <= i; j++) {

                if (i < 2 || j == 0) {

                    array[i][j] = 1; // 第一列和最后一列都是1
                } else {

                    // 当前值 = 上一行当前列 + 上一行当前列左边那个值
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }

        }

        for (int[] ints : array) {
            for (int i : ints) {

                if (i == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
