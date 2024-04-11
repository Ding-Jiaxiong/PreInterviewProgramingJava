package NowCoder.SelectiveStructure.J;

import java.util.Scanner;

public class Main {

    public static void runnian(int year) {

        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        runnian(n);

    }
}
