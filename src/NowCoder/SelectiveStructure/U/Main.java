package NowCoder.SelectiveStructure.U;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // 数学题
        if (n % 10 == 0) {
            System.out.println("0 0 0");
        } else if (n % 5 == 0) {
            System.out.println("1 1 2");
        } else {
            System.out.println("1 2 3");
        }

    }

}
