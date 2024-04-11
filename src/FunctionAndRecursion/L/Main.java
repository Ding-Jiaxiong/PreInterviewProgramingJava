package FunctionAndRecursion.L;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        while (n >= 10) {

            String string = String.valueOf(n);

            long ans = 0;

            for (int i = 0; i < string.length(); i++) {

                ans += Character.getNumericValue(string.charAt(i));
            }

            n = ans;

        }

        System.out.println(n);

    }

}
