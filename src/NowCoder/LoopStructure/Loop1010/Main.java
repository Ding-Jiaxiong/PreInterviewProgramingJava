package NowCoder.LoopStructure.Loop1010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
        } else {

            int res = 0, a = 1, b = 1;

            for (int i = 3; i <= n; i++) {

                res = a + b;
                a = b;
                b = res;
            }

            System.out.println(res);

        }

    }
}
