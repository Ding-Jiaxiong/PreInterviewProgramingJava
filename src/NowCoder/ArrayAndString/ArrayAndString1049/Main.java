package NowCoder.ArrayAndString.ArrayAndString1049;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[][] chs = new char[][]{
                {'0', '1', '2', '3', '4', '5'},
                {'6', '7', '8', '9', 'A', 'B'},
                {'C', 'D', 'E', 'F', 'G', 'H'},
                {'I', 'J', 'K', 'L', 'M', 'N'},
                {'O', 'P', 'Q', 'R', 'S', 'T'},
                {'U', 'V', 'W', 'X', 'Y', 'Z'}};

        int T = in.nextInt();

        while (T-- != 0) {

            char[] array = in.next().toCharArray();

            Arrays.sort(array);

            int p = 0, q = 0, maxr = 0, maxc = 0;

            int[] row = new int[6];
            int[] col = new int[6];

            for (int i = 0; i < array.length; i++) {
                char ch = array[i];

                while (ch != chs[p][q]) {  // 在整个表中寻找这个字符

                    if (q == 5) {  // 换行
                        p++;
                        q = 0;
                    } else {
                        q++;    // 往右走
                    }
                }

                row[p]++;
                maxr = Math.max(maxr, row[p]);
                col[q]++;
                maxc = Math.max(maxc, col[q]);
            }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {

                    if (row[i] == maxr && col[j] == maxc) {
                        System.out.print(chs[i][j]);
                    }
                }
            }

            System.out.println();

        }

    }

}
