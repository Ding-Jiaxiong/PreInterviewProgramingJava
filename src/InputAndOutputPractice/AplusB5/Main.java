package InputAndOutputPractice.AplusB5;

import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/E
 * 与前一题的区别就是固定了组数, 而不是输入0 结束
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = in.nextInt();

        while (total != 0) {

            int num = in.nextInt();
            int sum = 0;

            for (int i = 0; i < num; i++) {
                sum += in.nextInt();
            }

            System.out.println(sum);

            total--;

        }

    }

}
