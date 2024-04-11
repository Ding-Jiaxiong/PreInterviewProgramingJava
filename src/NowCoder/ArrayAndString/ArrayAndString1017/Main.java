package NowCoder.ArrayAndString.ArrayAndString1017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] ints = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                ints[i][j] = in.nextInt();
            }
        }

        int s_n = in.nextInt();
        int s_m = in.nextInt();

        System.out.println(ints[s_n - 1][s_m - 1]);

    }

}
