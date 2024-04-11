package NowCoder.LoopStructure.Loop1007;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        double res = 0.0;

        for (int i = 1; i <= N; i++) {
            res += (double) 1 / i;
        }

        System.out.printf("%.6f", res);

    }

}
