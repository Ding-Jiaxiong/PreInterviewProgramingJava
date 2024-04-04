package LoopStructure.Loop1011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2 || n == 3) {
            System.out.println(1);
        } else {

            int res = 0;
            int a = 0, b = 1, c = 1;

            for (int i = 4; i <= n; i++) {

                res = a + 2 * b + c;
                a = b;
                b = c;
                c = res;

            }

            System.out.println(res);
        }

    }

}
