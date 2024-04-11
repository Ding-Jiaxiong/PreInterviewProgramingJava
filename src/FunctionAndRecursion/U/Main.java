package FunctionAndRecursion.U;

import java.util.Scanner;

/**
 * 这道题用python 直接秒了
 *
 * Python AC:
 * ````
 * s = sum(eval(i) for i in input().split('+'))
 * print(s % 10000)
 * ````
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        String[] s1 = s.split("\\+");

        int res = 0;

        for (int i = 0; i < s1.length; i++) {

            String[] s2 = s1[i].split("\\*");

            int count = 1;
            for (int j = 0; j < s2.length; j++) {
                count *= Integer.parseInt(s2[j]);
                count %= 10000;
            }

            res = (res + count) % 10000;
        }

        System.out.println(res % 10000);
    }

}
