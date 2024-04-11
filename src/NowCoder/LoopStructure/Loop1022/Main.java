package NowCoder.LoopStructure.Loop1022;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ticket = 25;

        HashMap<Integer, Integer> shoupiaoyuan = new HashMap<>();
        shoupiaoyuan.put(25, 0);
        shoupiaoyuan.put(50, 0);
        shoupiaoyuan.put(100, 0);

        int flag = 1; // 初始认为一定能找清

        for (int i = 0; i < a.length; i++) {

            if (a[i] == ticket) {
                // 25 的情况 【一直可以收】
                shoupiaoyuan.put(25, shoupiaoyuan.get(25) + 1);

            } else if (a[i] == 50) {

                // 50的情况
                if (shoupiaoyuan.get(25) == 0) {
                    flag = 0;
                    break;
                } else {

                    shoupiaoyuan.put(25, shoupiaoyuan.get(25) - 1);
                }

            } else {
                // 100 的情况
                if (shoupiaoyuan.get(25) >= 3) {

                    shoupiaoyuan.put(25, shoupiaoyuan.get(25) - 3);

                } else {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }


    }

}
