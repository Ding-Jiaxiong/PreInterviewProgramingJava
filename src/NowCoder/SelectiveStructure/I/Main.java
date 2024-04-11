package NowCoder.SelectiveStructure.I;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 2 == 0 && n > 50) {

            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
