package NowCoder.SequentialStructure.Sequential1028;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println((a * b + a * c + b * c) * 2);
        System.out.println(a * b * c);

    }
}
