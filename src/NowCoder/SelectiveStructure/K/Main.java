package NowCoder.SelectiveStructure.K;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = 10;

        int positive = 0;
        int negative = 0;

        while (total-- != 0) {

            int tmp = in.nextInt();

            if (tmp > 0) {
                positive++;
            } else if (tmp < 0) {
                negative++;
            }

        }

        System.out.printf("positive:%d",positive);
        System.out.println();
        System.out.printf("negative:%d",negative);


    }
}
