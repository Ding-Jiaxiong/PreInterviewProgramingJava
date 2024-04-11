package NowCoder.SelectiveStructure.M;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[]{a, b, c};

        Arrays.sort(arr);

        System.out.printf("The maximum number is : %d", arr[2]);
        System.out.println();
        System.out.printf("The minimum number is : %d", arr[0]);

    }
}
