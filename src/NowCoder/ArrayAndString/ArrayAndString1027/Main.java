package NowCoder.ArrayAndString.ArrayAndString1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 找规律: https://www.bilibili.com/video/BV1Bx4y1j7yn/ 这个老师我觉得讲的很清晰
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[][] snakematrix = new int[n + 10][n + 10];  // 开大防止越界

        int cnt = 1; // 数字, 是几存几

        for (int i = 1; i <= 2 * n - 1; i++) {

            int col = 1; // 列
            int row = i; // 行

            while (row >= 1) {

                if (col <= n && row <= n) {

                    if (i % 2 != 0) {  // 奇数行
                        snakematrix[row][col] = cnt++;
                    } else { // 偶数行

                        snakematrix[col][row] = cnt++;
                    }

                }

                row--;
                col++;

            }

        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(snakematrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
