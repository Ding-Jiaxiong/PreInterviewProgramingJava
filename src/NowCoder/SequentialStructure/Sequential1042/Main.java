package NowCoder.SequentialStructure.Sequential1042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        System.out.println(Math.min(a, e) + Math.min(b, f) + Math.min(c, d));

    }
}
