package NowCoder.FunctionAndRecursion.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int R = in.nextInt();

        int ans = 0;

        for (int i = L; i <= R; i++) {

            String s = String.valueOf(i);

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '2') {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

}
