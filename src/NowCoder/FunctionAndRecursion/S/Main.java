package NowCoder.FunctionAndRecursion.S;

/*
 汉诺塔问题
 */

import java.util.Scanner;

public class Main {

    static int ans = 0;

    public static void hannuo(int n, char a, char b, char c) {

        if (n == 1) ans += 2;
        else {

            hannuo(n - 1, a, b, c);
            ans++;
            hannuo(n - 1, c, a, b);
            ans++;
            hannuo(n - 1, b, a, c);

        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int n = in.nextInt();

            ans = 0;

            hannuo(n, 'A', 'B', 'C');

            System.out.println(ans);

        }

    }

}
