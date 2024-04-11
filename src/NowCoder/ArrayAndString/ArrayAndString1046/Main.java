package NowCoder.ArrayAndString.ArrayAndString1046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String turn(String s) {

        int n = Integer.parseInt(s);
        int[] box = new int[4];

        int index = 0;
        while (n >= 26) { // 26进制

            box[index] = n % 26;
            n = n / 26;
            index++;
        }

        box[index] = n % 26;
        char[] ans = new char[3];

        for (int i = 0; i < 3; i++) {
            ans[i] = (char) ('a' + box[i]);
        }

        return ("" + ans[2] + ans[1] + ans[0]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        while (T-- != 0) {

            int n = Integer.parseInt(reader.readLine());
            String string = reader.readLine();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < string.length(); i += 5) {

                sb.append(turn(string.substring(i, i + 5)));
            }

            System.out.println(sb.toString());

        }

    }
}
