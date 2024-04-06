package ArrayAndString.ArrayAndString1007;

import java.util.Scanner;

/**
 * 原本思路错了, 题目就问了右边, 我还以为从右边数起 ....
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] A = new long[n + 1]; // 多开一个防止越界

        for (int i = 1; i <= n; i++) {
            A[i] = in.nextInt();
        }

        // 这种情况根本没有必要专门去创建出B 数组, 只管遍历判断即可
        for (int i = 1; i <= n; i++) {

            int flag = 0;

            for (int j = i + 1; j <= n; j++) {

                if (A[j] > A[i]) {
                    System.out.print(j);
                    System.out.print(' ');
                    flag = 1;
                    break;
                }

            }

            if (flag == 0) {
                System.out.print(0);
                System.out.print(' ');
            }

        }


    }

}
