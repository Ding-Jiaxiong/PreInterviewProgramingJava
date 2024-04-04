package SelectiveStructure.T;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int position = 0; // 前面最少a , 后面最多 b

        /**
         * 假设前面有a + x 人, x 最小可以为0, 假设后面有y 人, 0 <= y <= b
         *
         * a + x + 1 + y = n;
         * a + 1 + y <= n
         *
         */

        for (int i = b; i >= 0; i--) {
            if (a + 1 + i <= n) {
                position++;
            }
        }

        System.out.println(position);

    }
}

