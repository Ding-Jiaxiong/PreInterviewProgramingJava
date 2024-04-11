package NowCoder.InputAndOutputPractice.AplusB4;

import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/D
 * 一行一组数据, 输入0 结束, 每行的第一个数是该组数据的个数
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()){ // 这里用hasNextLine 也能AC【大佬的总结: 采用hasNextXxxx() 的话，后面也要用nextXxxx()】

            int num = in.nextInt();
            int sum = 0;

            for (int i = 0; i < num; i ++){
                sum += in.nextInt();
            }

            if (num == 0){
                break;
            }

            System.out.println(sum);

        }

    }

}
