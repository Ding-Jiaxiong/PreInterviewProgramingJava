package SequentialStructure.Sequential1026;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double up = in.nextDouble();
        double down = in.nextDouble();
        double height = in.nextDouble();

        System.out.printf("%.3f", (up + down ) * height / 2);

    }

}
