package FunctionAndRecursion.I;

import java.util.Scanner;

public class Main {
    public static boolean is_prime(int num) {

        if (num < 2) return false;
        else {

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int[] arr = new int[b];

        int count = 0;

        for (int i = a; i <= b; i++) {

            if (is_prime(i)) {
                arr[count++] = i;
            }
        }

        int i = 0;

        while (i < count) {

            int p = arr[i + 1] - arr[i];
            int q = arr[i + 2];

            if (arr[i + 1] == (arr[i] + arr[i + 2]) / 2) { // 如果这三个满足等差数列

                System.out.print(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);

                i += 3;  // 往后走三个数

                while (i < count && arr[i] == p + q) {  // 下一个i上的数仍然满足等差【p 是 公差, q 是 i 前面那个数】
                    System.out.print(" " + arr[i]);
                    i++;
                }

                System.out.println();
            } else {
                i++;   // 没找到这样的数列, 往前走
            }

        }

    }
}
