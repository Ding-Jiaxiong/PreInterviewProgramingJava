package FunctionAndRecursion.E;

/*
必须上大数了
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- != 0) {

            String num1 = in.next();
            String num2 = in.next();

            BigInteger int1 = new BigInteger(num1);
            BigInteger int2 = new BigInteger(num2);

            System.out.println(int1.multiply(int2));

        }

    }

}
