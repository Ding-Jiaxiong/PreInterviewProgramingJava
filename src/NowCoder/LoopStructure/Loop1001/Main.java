package NowCoder.LoopStructure.Loop1001;

import java.util.Scanner;

public class Main {

    public static void printjinzita(int n) {

        // 一共2n - 1 层
        // 上面 1 ~ n 层
        for (int i = 1; i <= n; i++) {  // 控制层数
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= 2 * i - 1; j++) { // 奇数
                System.out.print('*');
            }

            System.out.println();
        }

        // 下面 1 ~ (n - 1) 层
        for (int i = 1; i < n; i++) { // 控制层
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= -2 * i + 2 * n - 1; j++) {   // 找规律
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int n = in.nextInt();

            printjinzita(n);
        }

    }
}
