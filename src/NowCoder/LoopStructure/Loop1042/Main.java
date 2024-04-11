package NowCoder.LoopStructure.Loop1042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ans = 0;

        int[] apples = new int[10];

        for (int i = 0; i < 10; i++) {
            apples[i] = in.nextInt();
        }

        int taotao = in.nextInt() + 30;

        for (int i = 0; i < 10; i++) {
            if (apples[i] <= taotao) {
                ans++;
            }
        }

        System.out.println(ans);

    }

}
