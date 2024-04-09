package ArrayAndString.ArrayAndString1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 不同输入方式时间对比【牛客竞赛OJ】
 * 缓冲区: 22ms
 * 传统scanner: 53ms
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int[][] arr = new int[n + 10][n + 10]; // 开大防止越界

        int num = 1;  // 起始数字
        int x = 1, y = 0;

        while (num <= n * n) {

            while (y < n && arr[x][y + 1] == 0) arr[x][++y] = num++;  // 往右走
            while (x < n && arr[x + 1][y] == 0) arr[++x][y] = num++;  // 往下走
            while (y > 1 && arr[x][y - 1] == 0) arr[x][--y] = num++;  // 往左走
            while (x > 1 && arr[x - 1][y] == 0) arr[--x][y] = num++;  // 往上走

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }


    }

}
