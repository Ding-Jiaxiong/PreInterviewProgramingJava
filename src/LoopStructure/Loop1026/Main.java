package LoopStructure.Loop1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            int n = in.nextInt();

            int[] tudi = new int[n];

            for (int j = 0; j < n; j++) {
                tudi[j] = in.nextInt();
            }

            Arrays.sort(tudi); // 土地大小从小到大排序

            int ans = 0;

            for (int j = n - 1; j >= 0; j--) {

                if (tudi[j] >= ans + 1) { // 征用己方一块土地作为备用大使馆
                    ans++;
                } else {
                    break;
                }

            }

            System.out.println(ans);

        }


    }

}
