package NowCoder.LoopStructure.Loop1021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int K = in.nextInt();

        int total = 0;

        int i = 1; // 从第一天开始, i 会 1 长到 K

        int t = 1; // 1 个金币

        while (i <= K) { // 总共 K 天

            /**
             * 变相理解一下啊: 发1 个金币发了1 天, 发2 个金币发了2 天  ...
             */

            int m = t; // m 的天数中, 每天都发 t 个金币,

            while (m != 0 && i <= K) {

                total += t;

                m--;

                i++; // 天数一直在加
            }

            t++;  // 金币数 + 1 【该发下一个数量了】
        }

        System.out.println(total);

    }

}
