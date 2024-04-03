package SequentialStructure.Sequential1029;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double p = (a + b + c) / 2;

        System.out.printf("circumference=%.2f area=%.2f", a + b + c, Math.sqrt(p * (p - a) * (p - b) * (p - c)));

    }
}
