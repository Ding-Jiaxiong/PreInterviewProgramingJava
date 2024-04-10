package ArrayAndString.ArrayAndString1045;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine().toLowerCase();

        String[] article = reader.readLine().toLowerCase().split(" ");

        int pos = 0;
        int cnt = 0;
        int nowpos = 0;

        for (int i = 0; i < article.length; i++) {

            if (article[i].equals(word)) {

                if (cnt == 0) {

                    pos = nowpos;
                }

                cnt++;
            }

            nowpos = nowpos + article[i].length() + 1;
        }

        if (cnt == 0) {
            pos = -1;

            System.out.printf("%d", pos);
        } else {

            System.out.printf("%d %d", cnt, pos);
        }

    }

}
