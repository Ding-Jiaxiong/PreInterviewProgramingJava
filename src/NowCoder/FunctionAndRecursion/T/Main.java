package NowCoder.FunctionAndRecursion.T;

/**
 * Java 是过不了了, C ++ 秒过
 */

import java.util.Scanner;

public class Main {
    static int n;
    static int[] t = new int[5];

    static int[][] s = new int[15][5];

    public static void show() {

        for (int i = 1; i <= 3 * (2 * n + 1) + 4; i++) {
            System.out.print(".");
        }

        System.out.println();

        for (int i = n + 1; i >= 1; i--) {

            for (int j = 1; j <= 3; j++) {

                for (int k = 1; k <= n + 1 - s[i][j]; k++) System.out.print(".");

                for (int k = 1; k <= s[i][j]; k++) System.out.print("*");

                System.out.print(s[i][j] > 0 ? '*' : '|');

                for (int k = 1; k <= s[i][j]; k++) System.out.print("*");

                for (int k = 1; k <= n - s[i][j]; k++) System.out.print(".");
            }

            System.out.print(".");
            System.out.println();
        }

    }

    public static void move(int a, int c) {

        s[t[c] + 1][c] = s[t[a]][a];
        s[t[a]][a] = 0;
        t[a]--;
        t[c]++;
        for (int i = 1; i <= 3 * (2 * n + 1) + 4; i++) System.out.print("-");

        System.out.println();
        show();

    }

    public static void hanoi(int k, int a, int b, int c) {

        if (k == 1)
            move(a, c);
        else {
            hanoi(k - 1, a, c, b);
            move(a, c);
            hanoi(k - 1, b, a, c);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            s[i][1] = n - i + 1;
            t[1]++;
        }
        show();
        if (n % 2 == 0) {
            hanoi(n, 1, 2, 3);
        } else {
            hanoi(n, 1, 3, 2);
        }

    }

}
