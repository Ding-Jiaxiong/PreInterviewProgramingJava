package LoopStructure.Loop1036;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int n = in.nextInt();

        int[] ants = new int[n];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ants[i] = in.nextInt();

            int tmp = Math.min(ants[i], length - ants[i]);

            if (tmp > ans) {
                ans = tmp;
            }
        }

        System.out.println(ans);

    }

}
