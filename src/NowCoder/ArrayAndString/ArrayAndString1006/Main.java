package NowCoder.ArrayAndString.ArrayAndString1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a; // tmp
        int k = 0, j = 0; // k表示n 的序号, j 是 1的


        for (int i = 1; i <= n; i++) {

            a = in.nextInt();

            if (a == n) {
                k = i;
            }

            if (a == 1) {
                j = i;
            }
        }

        /**
         * 让k 和 j 有确定的大小关系
         */
        if (k < j) { // n的位置小于1的位置, 让他们交换

            int tmp = k;
            k = j;
            j = tmp;

        }

        System.out.println((k > n - j) ? k - 1 : n - j); // 距离两端的最值最远的数

    }

}
