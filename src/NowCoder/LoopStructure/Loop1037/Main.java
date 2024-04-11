package NowCoder.LoopStructure.Loop1037;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 小径长度
        int m = in.nextInt();  // 蚂蚁数量

        /**
         * 开始就是同一方向的蚂蚁相遇不了【不用考虑】
         *
         * 而且就算碰撞掉头, 就相当于灵魂互换, 所以还是看成同一只蚂蚁
         *
         * 所以这道题其实就是算最大的那个时间
         */

        int max = 0;

        while (m-- != 0) {

            int zuoyou = in.nextInt();
            int loc = in.nextInt();

            if (zuoyou == 0) {
                // 往左走
                max = Math.max(max, loc);
            } else {
                // 往右走
                max = Math.max(max, n - loc);
            }
        }

        System.out.println(max);


    }

}
