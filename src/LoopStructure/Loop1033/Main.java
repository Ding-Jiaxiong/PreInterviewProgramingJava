package LoopStructure.Loop1033;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] scores = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
            sum += scores[i];
        }

        Arrays.sort(scores);

        System.out.printf("%.2f %d %d", (double) sum / n, scores[n - 1], scores[0]);

    }

}
