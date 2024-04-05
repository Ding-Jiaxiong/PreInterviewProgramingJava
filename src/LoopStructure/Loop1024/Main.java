package LoopStructure.Loop1024;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        /**
         * 只能买一种包装就是纯小学数学题了
         */

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {

            double num = in.nextDouble();
            double price = in.nextDouble();

            /**
             * 向上取整
             */

            int cost = (int) (Math.ceil(n / num) * price);

            if (cost < res) {
                res = cost;
            }
        }

        System.out.println(res);

    }

}
