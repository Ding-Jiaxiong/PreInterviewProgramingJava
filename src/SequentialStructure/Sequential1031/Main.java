package SequentialStructure.Sequential1031;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long sec = in.nextLong();

        System.out.printf("%d %d %d", sec / 3600, sec % 3600 / 60 , sec % 60);

    }
}
