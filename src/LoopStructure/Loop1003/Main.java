package LoopStructure.Loop1003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inner = in.nextLine();
        char at = inner.charAt(0);

        int n = at - 'A' + 1; // 总层数

        for (int i = 1; i <= n; i++) { // 控制行数

            for (int j = 1; j <= n - i; j++) { // 空格
                System.out.print(' ');

            }

            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);

            }

            for (char k = (char) ('A' + i - 2); k >= 'A' ; k--) {  // 试出规律
                System.out.print(k);
            }

            System.out.println();

        }

    }

}
