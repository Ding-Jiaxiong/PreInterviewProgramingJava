package Company.Huawei.Recursion.LeetCode70;

import java.util.Scanner;

/**
 * 如果这道题数据再大很多, 就要上高精了
 */

public class Main {

    public static int climbStairs(int n) {

        if (n == 1 || n == 2) return n;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    /**
     * 递归写法
     *
     *     public static int climbStairs(int n) {
     *
     *         if (n == 1 || n == 2) return n;  // 直接递归会超时
     *
     *         return climbStairs(n - 1) + climbStairs(n - 2);
     *     }
     *
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(climbStairs(N));

    }

}
