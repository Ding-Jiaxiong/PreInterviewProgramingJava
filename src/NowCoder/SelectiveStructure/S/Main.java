package NowCoder.SelectiveStructure.S;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        long left = n, right = n;

        left -= right / 2;
        right -= left / 2;
        left -= right;

        System.out.println(left + right);

    }
}
