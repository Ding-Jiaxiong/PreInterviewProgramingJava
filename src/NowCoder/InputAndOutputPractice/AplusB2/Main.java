package NowCoder.InputAndOutputPractice.AplusB2;


import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/B
 * 接收组数, 每组俩正整数
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        while (num != 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a + b);
            num--;
        }

    }

}
