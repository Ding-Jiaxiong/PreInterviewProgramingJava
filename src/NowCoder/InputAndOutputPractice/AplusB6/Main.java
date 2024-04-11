package NowCoder.InputAndOutputPractice.AplusB6;

import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/F
 * 没说组数也没有结束标志, 一直输
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {  // 这里也可以用 hasNextInt

            int num = in.nextInt();
            int sum = 0;
            for (int i = 0; i < num; i++) {

                sum += in.nextInt();

            }

            System.out.println(sum);

        }


    }
}
