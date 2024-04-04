package LoopStructure.Loop1009;

import java.util.Scanner;

public class Main {

    // 等差数列前n 项和公式
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int res = 0;

        for (int i = 1; i <= n; i++) {

            res += i * (1 + i) / 2;
        }

        System.out.println(res);
    }

}
