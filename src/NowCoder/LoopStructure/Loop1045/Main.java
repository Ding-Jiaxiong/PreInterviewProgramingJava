package NowCoder.LoopStructure.Loop1045;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        int[] moon = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        while (T-- != 0) {

            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 1 && b == 0) {

                System.out.println(moon[1]);

            } else if (a == 2 && b == 1) {

                System.out.println(moon[0]);
            } else {

                for (int i = 0; i < 28; i++) {

                    if (moon[i] == a && moon[i + 1] == b) {

                        System.out.println(moon[i + 2]);
                    }
                }
            }

        }

    }

}
