package NowCoder.ArrayAndString.ArrayAndString1023;

import java.util.Scanner;

/**
 * 规律
 * 找出来就爆炸了
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 方格规格
        int m = in.nextInt(); // 病菌所在格子数

        if (n > m) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}
