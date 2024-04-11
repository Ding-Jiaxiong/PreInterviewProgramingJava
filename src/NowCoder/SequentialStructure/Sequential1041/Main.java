package NowCoder.SequentialStructure.Sequential1041;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = n, b = n;

        a -= b / 2; // 减去对方的一半
        b -= a / 2; // 减去对方的一半
        a -= b; // 减去对方

        System.out.println(a + b);

    }

}
