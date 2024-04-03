package InputAndOutputPractice.StringSorting3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://ac.nowcoder.com/acm/contest/5657/J
 * 分隔符不同
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            String[] strings = in.nextLine().split(",");

            Arrays.sort(strings);

            for (int i = 0; i < strings.length - 1; i++) {
                System.out.print(strings[i] + ',');
            }

            System.out.print(strings[strings.length - 1]);

            System.out.println();

        }
    }

}
