package NowCoder.ArrayAndString.ArrayAndString1005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 记录下的

        int[] moons_size = new int[n];

        for (int i = 0; i < n; i++) {

            moons_size[i] = in.nextInt();
        }

        // 直接开判
        if (moons_size[n - 1] == 0) {
            System.out.println("UP");

        } else if (moons_size[n - 1] == 15) {
            System.out.println("DOWN");

        } else if (n == 1) {
            System.out.println("-1");

        } else if (moons_size[n - 1] > moons_size[n - 2]) {
            System.out.println("UP");

        } else if (moons_size[n - 1] < moons_size[n - 2]) {
            System.out.println("DOWN");
        }

    }

}
