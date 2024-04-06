package ArrayAndString.ArrayAndString1003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // n个人
        int k = in.nextInt(); // k 开始报数
        int m = in.nextInt(); // m 出列

        int p = 0;  // 假装指针

        for (int i = 2; i <= n; i++) {

            p = (p + m) % i;
        }

        System.out.println((p + k) % n); // 纯纯规律啊

    }

}
