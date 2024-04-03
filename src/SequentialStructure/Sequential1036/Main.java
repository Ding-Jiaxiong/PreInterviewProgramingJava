package SequentialStructure.Sequential1036;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long[] arr = new long[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextLong();
        }

        Arrays.sort(arr);
        System.out.println(Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2])));

    }

}