package ArrayAndString.ArrayAndString1044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        while (T-- != 0) {

            int n = Integer.parseInt(reader.readLine());

            int ans = 0;

            for (int i = 0; i < n; i++) {

                String string = reader.readLine();

                if (string.startsWith("bnu16")) {
                    ans++;
                }
            }

            System.out.println(ans);

        }

    }

}
