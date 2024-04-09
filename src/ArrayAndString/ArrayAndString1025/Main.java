package ArrayAndString.ArrayAndString1025;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] ints = new int[9][9];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {

                ints[i][j] = in.nextInt();
            }
        }

        // 每一行
        for (int i = 0; i < ints.length; i++) {

            HashSet<Integer> row = new HashSet<>();

            for (int j = 0; j < ints[i].length; j++) {

                row.add(ints[i][j]);
            }

            if (row.size() != 9) {
                System.out.println("NO");
                return;
            }
        }

        // 每一列
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> column = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                column.add(ints[j][i]);
            }

            if (column.size() != 9) {
                System.out.println("NO");
                return;
            }

        }

        // 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                HashSet<Integer> three_three = new HashSet<>();

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        three_three.add(ints[i * 3 + k][j * 3 + l]);
                    }
                }

                if (three_three.size() != 9) {
                    System.out.println("NO");
                    return;
                }

            }
        }

        System.out.println("YES");

    }

}
