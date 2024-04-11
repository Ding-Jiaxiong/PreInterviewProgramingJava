package NowCoder.SelectiveStructure.H;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = Math.abs(in.nextInt());
        int b = Math.abs(in.nextInt());
        int n = in.nextInt();

        if ((a + b) > n) {
            System.out.println("NO");
        } else if ((a + b - n) % 2 != 0) { // 偶数步【只会是偶数步】
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
