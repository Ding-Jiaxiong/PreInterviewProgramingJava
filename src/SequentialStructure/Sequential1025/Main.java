package SequentialStructure.Sequential1025;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nums = in.nextLine().split(" ");

        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        System.out.printf("%.1f", sum / 5);
    }

}
