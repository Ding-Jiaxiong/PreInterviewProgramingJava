package LoopStructure.Loop1044;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double Sn = 0.0;

        int k = in.nextInt();

        int n = 0;

        for (int i = 1; ; i++) {

            Sn += (double) 1 / i;

            if (Sn > k) {
                n = i;
                break;
            }
        }

        System.out.println(n);

    }

}
