package NowCoder.SelectiveStructure.N;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[]{a + b + c, a * b * c, a + b * c, (a + b) * c, a * (b + c), a * b + c,};

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);

    }
}
