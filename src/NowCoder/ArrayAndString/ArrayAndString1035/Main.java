package NowCoder.ArrayAndString.ArrayAndString1035;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String s = "";

        int tmp = 1;

        while (s.length() <= n) {

            s += String.valueOf(tmp++);

        }

        System.out.println(s.charAt(n - 1));

    }

}
