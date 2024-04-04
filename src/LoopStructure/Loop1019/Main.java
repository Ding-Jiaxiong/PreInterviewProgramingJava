package LoopStructure.Loop1019;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long k = in.nextLong();
        long N = in.nextLong();

        // 进制题
        /**
         * 例子: 1,3,4,9,10,12,13 → 三进制数 1,10,11,100,101,110,111 → 二进制 1,2,3,4,5,6
         *
         * 思路: 先将n 进行二进制转换, 再根据k 进制转换为10 进制得到答案
         */

        ArrayList<Long> a = new ArrayList<>();

        while (N != 0) { // 转换二进制, 从后往前即正确顺序

            long t = N % 2;
            a.add(t);
            N = N / 2;
        }

        long ans = 0;
        for (int i = 0; i < a.size(); i++) {
            ans = (long) (ans + a.get(i) * Math.pow(k, i));
        }

        System.out.println(ans);

    }

}
