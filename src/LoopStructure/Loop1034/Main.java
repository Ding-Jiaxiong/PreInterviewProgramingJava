package LoopStructure.Loop1034;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            sum += nums[i];
        }

        Arrays.sort(nums);

        if (sum % 2 == 0) {

            System.out.println(sum);
        } else {

            // 减去最小的那个奇数即可
            for (int i = 0; i < n; i++) {

                if (nums[i] % 2 != 0) {
                    sum -= nums[i];
                    break;
                }
            }

            System.out.println(sum);

        }


    }

}
