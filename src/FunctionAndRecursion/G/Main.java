package FunctionAndRecursion.G;

import java.util.Scanner;

public class Main {

    // 判断是否回文
    public static boolean huiwenshu(String num) {

        StringBuilder sb = new StringBuilder(num).reverse();

        return !sb.toString().equals(num);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String m = in.next();

        int count = 0;

        while (huiwenshu(m)) {

            count++;
            if (count > 30) {
                break;
            }

            Long num1 = Long.parseLong(m, n);
            String string = new StringBuilder(m).reverse().toString();

            Long num2 = Long.parseLong(string, n);
            Long num3 = num1 + num2;

            m = Long.toString(num3, n);
        }

        if (count <= 30) {
            System.out.printf("STEP=%d", count);
        } else {
            System.out.println("Impossible!");
        }


    }

}
