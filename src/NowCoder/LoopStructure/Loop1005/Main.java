package NowCoder.LoopStructure.Loop1005;

import java.util.Scanner;

public class Main {

    public static void printjianxing(int n) {

        // 上
        // 空格
        for (int i = 0; i <= n; i++) { // 控制行数【n + 1】行

            for (int j = n; j > i; j--) {
                System.out.print("  ");

            }


            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        // 下
        for (int i = n; i >= 1; i--) { // 控制行数【n 行】

            for (int j = n - i; j >= 0; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int n = in.nextInt();

            printjianxing(n);

        }

    }

}
