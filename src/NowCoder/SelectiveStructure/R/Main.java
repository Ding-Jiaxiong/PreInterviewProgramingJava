package NowCoder.SelectiveStructure.R;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double N = in.nextDouble();

        double res = N * 12 * 2.54 * 10;

        if (res % 1 != 0) {
            System.out.printf("%.1f", res);
        } else {
            System.out.println((int) res);
        }

    }
}
