package LoopStructure.Loop1031;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int s = 1;

        while (N > s) {

            N -= s;
            s++;
        }

        if (s % 2 == 0) {
            System.out.printf("%d/%d", N, s - N + 1);
        } else {
            System.out.printf("%d/%d", s - N + 1, N);
        }

    }

}
