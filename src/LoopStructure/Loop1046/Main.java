package LoopStructure.Loop1046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] mountains = new long[n];

        for (int i = 0; i < n; i++) {
            mountains[i] = in.nextLong();
        }

        int fanyuecishu = 0;

        for (int i = 0; i < n - 2; i++) { // 最后两个不管, 因为我们是以三个高度为一次判断

            if (mountains[i] <= mountains[i + 1] && mountains[i + 1] > mountains[i + 2]) {
                fanyuecishu ++;
            }

        }

        System.out.println(fanyuecishu);

    }

}
