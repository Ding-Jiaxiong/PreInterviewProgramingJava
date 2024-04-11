package NowCoder.InputAndOutputPractice.AplusB7;

import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/G
 * 未知组数, 每组未知个数
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            int sum = 0;

            // 一行一行的读
            String[] arr = in.nextLine().split(" ");// 空格切

            for (String s : arr) {
                sum += Integer.parseInt(s);
            }

            System.out.println(sum);

        }

    }

}
