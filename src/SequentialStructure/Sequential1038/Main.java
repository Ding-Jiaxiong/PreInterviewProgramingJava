package SequentialStructure.Sequential1038;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(4 * (int) Math.sqrt(a * b / c + a * c / b + b * c / a + (a + b + c) * 2));

    }
}
