package NowCoder.LoopStructure.Loop1049;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
                System.out.println(i);
            }

        }

    }

}
