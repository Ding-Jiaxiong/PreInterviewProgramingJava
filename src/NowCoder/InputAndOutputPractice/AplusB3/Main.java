package NowCoder.InputAndOutputPractice.AplusB3;

import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/C
 * 有结束的标志, 虽然是一直读一行的两个数字, 但是如果输入0 0 则输入结束
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        while (a != 0 && b != 0) {

            System.out.println(a + b);
            a = in.nextInt();
            b = in.nextInt();

        }


    }

}
