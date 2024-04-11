package Company.Huawei.Recursion.LeetCode509;

import java.util.Scanner;

public class Main {

    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(fib(n));
    }

}
