package NowCoder.ArrayAndString.ArrayAndString1050;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // 图书馆书的数量
        int q = in.nextInt();   // 读者的数量

        int[] books_id = new int[n];  // 图书编码数组
        int[] reader_needid = new int[q];  // 读者需求码数组

        for (int i = 0; i < n; i++) {
            books_id[i] = in.nextInt();
        }

        Arrays.sort(books_id);

        for (int i = 0; i < q; i++) {
            int length = in.nextInt();
            reader_needid[i] = in.nextInt();
        }

        for (int i = 0; i < reader_needid.length; i++) {  // 遍历用户需求码

            int user_need = reader_needid[i];
            boolean flag = false; // 没有找到
            int index = 0;   // 最小的图书编码下标

            for (int j = 0; j < books_id.length; j++) {

                if (String.valueOf(books_id[j]).endsWith(String.valueOf(user_need))) {  // 找到了

                    flag = true;
                    index = j;
                    break;
                }

            }

            if (flag) {

                System.out.println(books_id[index]);
            } else {
                System.out.println(-1);
            }

        }

    }
}
