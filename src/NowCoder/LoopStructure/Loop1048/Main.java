package NowCoder.LoopStructure.Loop1048;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- != 0) {

            int l = in.nextInt();
            int r = in.nextInt();

            int ans = 0;
            for (int i = l; i <= r; i++) {

                int gewei = i % 10;
                int shiwei = i / 10 % 10;
                int baiwei = i / 100;

                int num = baiwei * shiwei;

                int num_gewei = num % 10;
                if (num_gewei == gewei) {
                    ans++;
                }

            }

            System.out.println(ans);

        }

    }

}
