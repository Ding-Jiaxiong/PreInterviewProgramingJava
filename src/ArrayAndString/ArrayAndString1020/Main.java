package ArrayAndString.ArrayAndString1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 这道题要考虑读入速度了, 平常写过不了
 */

public class Main {

    public static void main(String[] args) throws IOException {

        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        streamTokenizer.nextToken();

        int t = (int) streamTokenizer.nval;

        while (t-- != 0) {

            streamTokenizer.nextToken();
            int n = (int) streamTokenizer.nval;

            int[][] ints = new int[n][n];

            streamTokenizer.nextToken();
            int count = (int) streamTokenizer.nval;

            while (count-- != 0) {

                streamTokenizer.nextToken();
                int op = (int) streamTokenizer.nval;
                streamTokenizer.nextToken();
                int k = (int) streamTokenizer.nval;
                streamTokenizer.nextToken();
                int v = (int) streamTokenizer.nval;

                if (op == 1) {
                    for (int i = 0; i < n; i++) {
                        ints[k - 1][i] = v;
                    }
                } else if (op == 2) {
                    for (int i = 0; i < n; i++) {
                        ints[i][k - 1] = v;
                    }
                }

            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ints[i][j] + " ");
                }

                System.out.println();
            }

        }

    }
}
