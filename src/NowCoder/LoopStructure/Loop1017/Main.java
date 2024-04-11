package NowCoder.LoopStructure.Loop1017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 4 != 0 && !String.valueOf(i).contains("4")) {
                System.out.println(i);
            }
        }

    }

}
