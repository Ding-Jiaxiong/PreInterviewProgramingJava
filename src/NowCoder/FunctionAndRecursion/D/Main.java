package NowCoder.FunctionAndRecursion.D;

import java.util.Scanner;

public class Main {

    public static boolean shuweihe_5(int n) {

        String string = String.valueOf(n);

        int ans = 0;

        for (int i = 0; i < string.length(); i++) {

            ans += Character.getNumericValue(string.charAt(i));
        }

        if (ans % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int ans = 0;

        for (int i = a; i <= b; i++) {

            if (shuweihe_5(i)) {
                ans++;
            }
        }

        System.out.println(ans);

    }

}
