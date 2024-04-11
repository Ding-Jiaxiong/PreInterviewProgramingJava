package NowCoder.ArrayAndString.ArrayAndString1002;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int times = 0;

        for (int i = 1; i <= n; i++) {

            String value = String.valueOf(i);

            for (int j = 0; j < value.length(); j++) {

                if (value.charAt(j) == String.valueOf(x).charAt(0)) {
                    times++;
                }

            }

        }

        System.out.println(times);

    }

}
