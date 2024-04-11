package NowCoder.SelectiveStructure.F;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int weight = in.nextInt();

        if (weight % 2 == 0 && weight != 2) {  // 2要特判
            System.out.println("YES, you can divide the watermelon into two even parts.");
        } else {
            System.out.println("NO, you can't divide the watermelon into two even parts.");
        }
    }
}
