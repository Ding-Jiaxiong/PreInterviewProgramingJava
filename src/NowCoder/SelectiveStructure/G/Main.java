package NowCoder.SelectiveStructure.G;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if ((n - 1) % 2 == 0 && n != 2) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }

    }
}
