package FunctionAndRecursion.H;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 判断一个数是不是完全平方数
    public static boolean is_wanquanpingfangshu(int n) {

        return Math.sqrt(n) % 1 == 0;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = in.nextInt();
        }

        Arrays.sort(ints);

        for (int i = n - 1; i >= 0; i--) {

            if (!is_wanquanpingfangshu(ints[i])) {
                System.out.println(ints[i]);
                break;
            }
        }

    }

}
