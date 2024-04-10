package ArrayAndString.ArrayAndString1047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        char[] array = in.next().toCharArray(); // 这里不能用nextLine(), 会把换行符一块读进来

        // m 次操作
        for (int i = 1; i <= m; i++) {

            int l = in.nextInt();
            int r = in.nextInt();
            char c1 = in.next().charAt(0);
            char c2 = in.next().charAt(0);

            for (int j = l - 1; j <= r - 1; j++) {
                if (array[j] == c1) {
                    array[j] = c2;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

}
