package NowCoder.ArrayAndString.ArrayAndString1001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * 计算方差的函数
     */
    public static double calVariance(double[] numbers) {

        int n = numbers.length;

        double mean = 0.0;

        for (double x : numbers) {
            mean += x;
        }

        mean /= n;

        double variance = 0;
        for (double x : numbers) {

            variance += (x - mean) * (x - mean);
        }

        variance /= n;

        return variance;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            int n = in.nextInt();  // 试卷数字个数

            double[] nums = new double[n];

            for (int i = 0; i < n; i++) {

                nums[i] = in.nextDouble();
            }

            Arrays.sort(nums);

            double jicha = nums[n - 1] - nums[0];

            double fangcha = calVariance(nums);

            System.out.printf("%d %.3f\n", (int) jicha, fangcha);


        }

    }

}
