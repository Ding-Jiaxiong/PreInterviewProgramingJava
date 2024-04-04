package LoopStructure.Loop1008;

import java.util.Scanner;

public class Main {

    public static int fenmu(int num) {

        int res = 0;
        for (int i = 1, flag = 1; i <= 2 * num - 1; i += 2) {

            res += i * flag;
            flag *= -1;

        }

        return res;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double res = 0.0;

        for (int i = 1; i <= n; i++) {

            res += (double) 1 / fenmu(i);
        }

        System.out.printf("%.3f", res);

    }

}
