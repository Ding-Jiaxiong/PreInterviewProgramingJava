package NowCoder.SelectiveStructure.B;

import java.util.Scanner;

public class Main {

    public static int kalazi(int n) {

        if (n % 2 != 0) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(kalazi(n));


    }
}
