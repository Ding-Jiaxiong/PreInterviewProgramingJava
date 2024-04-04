package LoopStructure.Loop1004;

import java.util.Scanner;

public class Main {

    public static void printlinxing(double n) {

        // 共 n 层
        // 上有 n / 2向上取整层
        int shang = (int) Math.ceil(n / 2);
        int xia = (int) (n - shang);

        // 上
        for (int i = 1; i <= shang; i++) { // 控制层数

            // 空格
            for (int j = 1; j < shang - i + 1; j++) {
                System.out.print(' ');
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }

            System.out.println();
        }

        // 下
        for (int j = xia; j >= 1; j--) {  // 控制行数

            // 空格
            for (int l = 1; l <= (-1) * j + shang; l++) {
                System.out.print(' ');
            }

            for (int m = 2 * j - 1; m >= 1; m--) {
                System.out.print('*');
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            double num = in.nextDouble();

            printlinxing(num);

        }

    }

}
