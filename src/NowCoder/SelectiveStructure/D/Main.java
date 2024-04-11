package NowCoder.SelectiveStructure.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long m = in.nextLong();
        long n = in.nextLong();

        if (m % n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
