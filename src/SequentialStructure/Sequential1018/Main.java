package SequentialStructure.Sequential1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int N = in.nextInt();

        System.out.println((X + N) % 7 == 0 ? 7 : (X + N) % 7);
    }
}
