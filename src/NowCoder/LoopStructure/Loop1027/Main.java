package NowCoder.LoopStructure.Loop1027;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            int N = in.nextInt(); // 拥有的钱
            int M = in.nextInt(); // 猫粮种数

            int[] price = new int[M];

            for (int i = 0; i < M; i++) {
                price[i] = in.nextInt();
            }

            /**
             * 这道题注意不能排序, 题目要求只能挨个儿买, 买不起就跳过
             */

            int ans = 0;

            for (int i = 0; i < M; i++) {

                if (price[i] <= N) {
                    ans++;
                    N -= price[i];
                }
            }

            System.out.println(ans);

        }

    }

}
