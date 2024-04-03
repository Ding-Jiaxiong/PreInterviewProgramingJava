package SequentialStructure.Sequential1024;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.printf("%.2f %.2f", a + b + c, (a + b + c) / 3);

    }
}
