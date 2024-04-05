package LoopStructure.Loop1028;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int R = in.nextInt();

        int O_N = N;

        StringBuilder builder = new StringBuilder();

        while (N != 0) {

            int re = N % R;

            if (re < 0) {
                re -= R;
                N += R;
            }

            N /= R;
            if (re >= 10) {
                builder.insert(0, (char) ('A' + re - 10));
            } else {
                builder.insert(0, re);
            }
        }

        String s = builder.toString();
        if (s.isEmpty()) {
            s = "0";
        }

        System.out.printf(O_N + "=" + s + "(base" + R + ")");

    }

}
