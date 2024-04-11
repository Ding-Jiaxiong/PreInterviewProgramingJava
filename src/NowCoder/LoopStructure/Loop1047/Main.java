package NowCoder.LoopStructure.Loop1047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt(); // 当前资金
        int k = in.nextInt(); // 瓶子
        int g = in.nextInt(); // 瓶盖
        int p = in.nextInt(); // 酒价

        int total = 0;

        if (m > 0) { // 先把钱花光

            k += m / p; // 瓶子
            g += m / p; // 瓶盖

            total += m / p; //
        }

        while (k >= 2 || g >= 4) {

            total += k / 2;
            total += g / 4;

            int tmp_k = k;
            int tmp_g = g;

            k = k - (k / 2 * 2) + k / 2 + tmp_g / 4;
            g = g - (g / 4 * 4) + g / 4 + tmp_k / 2;
        }

        System.out.println(total);

    }

}
