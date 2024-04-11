package NowCoder.ArrayAndString.ArrayAndString1009;

/**
 * 不知道为什么老是会报越界, 同样的逻辑用C ++ 实现可以AC
 *
 * 看了大佬的代码, 循环里面有个地方需要特判
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] course = new int[m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int sum = input.nextInt();

            if (sum == 0) {
                course[0] = 0;
            } else {

                for (int j = 0; j < sum; j++) {

                    if (input.hasNext()) { // 加上这里【值得注意】
                        int number = input.nextInt();
                        course[number - 1]++;
                    }

                }

            }
        }

        for (int i = 0; i < m; i++) {
            if (course[i] == n) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
