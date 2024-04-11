package NowCoder.LoopStructure.Loop1020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        // 找规律
        /**
         * 将k 转换成2进制, 把这个2进制当成3进制, 再转换为10 进制
         */

        int flag = 1;

        while (T-- != 0) {

            int k = in.nextInt();

            long weight = 0, times = 1;

            while (k != 0) {
                weight += (k % 2) * times;

                times *= 3;

                k /= 2;
            }

            System.out.printf("Case #%d: %d\n", flag++, weight);

        }

    }

}
