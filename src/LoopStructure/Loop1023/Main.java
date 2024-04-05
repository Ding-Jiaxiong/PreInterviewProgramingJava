package LoopStructure.Loop1023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int xuefenhe = 0;

        double fenzi = 0.0;

        while (n-- != 0) {

            double jidian = in.nextDouble();
            int xuefen = in.nextInt();

            xuefenhe += xuefen;
            fenzi += jidian * xuefen;

        }

        System.out.printf("%.1f", fenzi / xuefenhe);

    }

}
