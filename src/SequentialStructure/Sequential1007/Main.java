package SequentialStructure.Sequential1007;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();

        double res = b / (double) a;
        res = res * 100;

        System.out.printf("%.3f%%", res);
    }

}
