package NowCoder.InputAndOutputPractice.AplusB1;

import java.util.Scanner;

/**
 * 题目地址: https://ac.nowcoder.com/acm/contest/5657/A
 * 分析: 未知组数的多组数据, 每组数据俩整数
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) { // hasNext()遇到空格会自动把字符串截断，也就是说hasNext()只能获取到空格之前和空格之后的字符串，并返回true【始终等待键盘输入】
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a + b);
        }


    }

}
