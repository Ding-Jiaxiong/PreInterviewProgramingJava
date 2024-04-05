package LoopStructure.Loop1040;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int step = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;

            } else {
                n = n * 3 + 1;
            }
            step++;

        }

        System.out.println(step);
    }

}
