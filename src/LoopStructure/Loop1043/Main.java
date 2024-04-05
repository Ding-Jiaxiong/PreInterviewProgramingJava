package LoopStructure.Loop1043;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mom = 0;
        int jinjin = 0;

        int[] cost = new int[12];

        for (int i = 0; i < 12; i++) {

            cost[i] = in.nextInt();
        }

        for (int i = 0; i < 12; i++) {

            jinjin += 300 - cost[i];
            if (jinjin < 0) {
                System.out.println("-" + (i + 1));
                return;
            }

            mom += jinjin / 100 * 100;
            jinjin -= jinjin / 100 * 100;
        }

        System.out.println((int) (mom * 1.2 + jinjin));

    }

}
