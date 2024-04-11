package NowCoder.ArrayAndString.ArrayAndString1042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder(reader.readLine());

        for (int i = builder.length() - 1; i > 0; i -= 3) {

            if (i < 3) {  // 已经不用插了
                break;
            } else builder.insert(i - 2, ",");

        }

        System.out.println(builder);

    }
}
