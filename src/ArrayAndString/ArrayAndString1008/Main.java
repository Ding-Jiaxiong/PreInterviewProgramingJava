package ArrayAndString.ArrayAndString1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {

            nums[i] = in.nextInt();
        }

        int ans = 0;

        for (int i = 0, pos = 0; i < N; i++, pos++) {

            for (int j = pos + 1; j < N; j++) { // 时间复杂度直接N^2 了 ...

                if (nums[i] > nums[j]) {
                    ans++;
                }

            }
        }

        System.out.println(ans);


    }

}
