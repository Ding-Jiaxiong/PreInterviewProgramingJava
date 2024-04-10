package FunctionAndRecursion.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第一次交超时了, 第二次用了平方根，过了
 */

public class Main {

    public static boolean is_prime(long n) {

        if (n <= 1) return false;
        else {

            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }


        return true;
    }

    public static String huiwenshu(String num) {

        StringBuilder builder_1 = new StringBuilder(num);
        StringBuilder builder_2 = new StringBuilder(num);  // 副本

        String rever = builder_1.reverse().toString().substring(1, builder_1.length());

        builder_2.append(rever);

        return builder_2.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        String huiwenshu = huiwenshu(s);

        Long value = Long.valueOf(huiwenshu);

        if (is_prime(value)) {
            System.out.println("prime");
        } else {
            System.out.println("noprime");
        }

    }

}
