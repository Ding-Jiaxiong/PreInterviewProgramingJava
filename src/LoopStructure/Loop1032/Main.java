package LoopStructure.Loop1032;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {

            ints[i] = in.nextInt();
        }

        Arrays.sort(ints);

        System.out.println(ints[n - 1] - ints[0]);

    }

}
