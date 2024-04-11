package NowCoder.ArrayAndString.ArrayAndString1004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int L = in.nextInt(); // 马路长度
        int M = in.nextInt();  // 区域数目

        int shengxia_trees = 0;

        int[] tree = new int[L + 1];  // 用0标志还有树在

        for (int i = 0; i < M; i++) {

            int m1 = in.nextInt();
            int m2 = in.nextInt();

            for (int j = m1; j <= m2; j++) {

                tree[j] = -1; // 移掉
            }
        }

        for (int i = 0; i <= L; i++) {

            if (tree[i] == 0) {
                shengxia_trees++;
            }
        }

        System.out.println(shengxia_trees);

    }

}
