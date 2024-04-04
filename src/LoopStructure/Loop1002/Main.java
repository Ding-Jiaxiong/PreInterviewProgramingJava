package LoopStructure.Loop1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int s = 1;

        for (int i = 1; i <= n; i++) {  // 控制行数

            for (int j = 1; j <= i; j++) { // 每行数字个数

                System.out.printf("%4d", s);
                s++;
            }

            System.out.println();

        }

    }

}
