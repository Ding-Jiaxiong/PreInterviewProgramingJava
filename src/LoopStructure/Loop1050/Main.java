package LoopStructure.Loop1050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            String s = String.valueOf(i);
            StringBuffer buffer = new StringBuffer(s);
            String reversed_s = buffer.reverse().toString();

            if (s.equals(reversed_s)) {
                System.out.println(i);
            }

        }

    }

}
