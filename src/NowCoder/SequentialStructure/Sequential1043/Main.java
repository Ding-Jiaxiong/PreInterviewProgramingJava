package NowCoder.SequentialStructure.Sequential1043;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        System.out.println(2 * (n / 3) + (n % 3 >= 1 ? 1 : 0));

    }

}
