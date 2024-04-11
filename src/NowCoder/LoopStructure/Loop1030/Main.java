package NowCoder.LoopStructure.Loop1030;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int flag = 0;

        while (n != 1) {

            for (int i = 2; i <= n; i++) {

                if (n % i == 0) {

                    n = n / i;

                    flag++;

                    break;
                }
            }

        }

        if (flag % 2== 0) System.out.println("Johnson");
        else System.out.println("Nancy");

    }

}
