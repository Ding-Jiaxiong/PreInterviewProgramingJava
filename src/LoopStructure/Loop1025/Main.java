package LoopStructure.Loop1025;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int count1 = 0;
        int count5 = 0;
        int count10 = 0;

        for (int i = 0; i < k; i++) {

            int tmp = in.nextInt();

            if (tmp == 1) {
                count1++;
            } else if (tmp == 5) {
                count5++;
            } else if (tmp == 10) {
                count10++;

            }

        }

        System.out.printf("%d %d %d", count1, count5, count10);

    }

}
