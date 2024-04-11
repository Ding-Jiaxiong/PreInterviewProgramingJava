package NowCoder.LoopStructure.Loop1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            long n = in.nextLong();

            System.out.println(Long.bitCount(n));

        }

    }

}
