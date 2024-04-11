package NowCoder.SequentialStructure.Sequential1045;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double H = in.nextDouble();
        double S1 = in.nextDouble();
        double V = in.nextDouble();
        double L = in.nextDouble();
        double K = in.nextDouble();
        int n = in.nextInt();

        int ans = 0;
        double g = 10.0;

        double t1, t2, s1, s2;

        /**
         * 没接住的两种情况:
         * 1. 球落地了, 小车还没到
         * 2. 球落地了, 小车已经开过去了
         *
         * 【第一种】情况: s1
         * 车还没到就落地了, 小球下落高度为整个H
         * 时间 t1 = sqrt(2 * H / g)
         * 小车走过的距离就是 t1 * V , 如果这段距离小车不能到达小球, 小球就掉地上, 就是说小车开的距离得大于等于这个距离才能接住
         *
         *
         * 【第二种】情况: s2
         * 车开过了, 小球才落地, 小球下落高度H - K
         * t2 = sqrt(2 * (H - K) / g)
         * 小车走过的距离是 t2 * V , 就是说，小车开的距离得小于等于这个距离才接得住
         */

        t1 = Math.sqrt((H * 2.0) / g);
        t2 = Math.sqrt(((H - K) * 2.0 / g));
        s1 = S1 - t1 * V - 0.0001;
        s2 = S1 + L - t2 * V + 0.0001;


        for (int i = 0; i < n; i++) { // n - 1个小球
            if (i >= s1 && i <= s2) {

                ans++;
            }
        }

        System.out.println(ans);


    }
}
