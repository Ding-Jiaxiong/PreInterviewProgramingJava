package NowCoder.FunctionAndRecursion.F;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        for (int i = 0; i < n; i++) {

            String A = in.next();
            String B = in.next();

            BigInteger integerA = new BigInteger(A);
            BigInteger integerB = new BigInteger(B);

            System.out.println(integerA.add(integerB));

        }


    }

}
