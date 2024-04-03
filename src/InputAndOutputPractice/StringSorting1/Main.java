package InputAndOutputPractice.StringSorting1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/H
 * 第一行字符串个数, 第二行对应个数的字符串 【注意无结尾空格】【虽然这里只有一行, 但是也要用while 来过滤掉换行, 不然输入完num, 直接就结束了】
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        while (in.hasNext()){ // 这里面Line也用可不用
            String[] arr = in.nextLine().split(" ");
            Arrays.sort(arr);

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ' ');
            }

            System.out.print(arr[arr.length - 1]);
        }

    }

}
