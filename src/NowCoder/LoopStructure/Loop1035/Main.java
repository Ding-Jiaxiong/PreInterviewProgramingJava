package NowCoder.LoopStructure.Loop1035;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] ints = new int[n];

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            ints[i] = in.nextInt();

            if (ints[i] < min) {
                min = ints[i];
            }

            if (ints[i] > max) {
                max = ints[i];
            }
        }

        int cida = 0;
        int cixiao = 0;

        Arrays.sort(ints);

        for (int i = 0; i < n; i++) {

            if (ints[i] > min) {
                cixiao = ints[i];
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {

            if (ints[i] < max) {
                cida = ints[i];
                break;
            }
        }

        /**
         * 注意: 有可能一样, 就不能这样减了【直接排序过不去】
         */

        System.out.printf("%d %d %d %d", max - cida, max - cixiao, cida - cixiao, cida - min);

    }

}
