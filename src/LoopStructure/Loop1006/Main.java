package LoopStructure.Loop1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int res = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                res += i;
            } else {
                res -= i;
            }

        }

        System.out.println(res);

    }

}
