package ArrayAndString.ArrayAndString1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String alan = "alan";

        int res = 0;

        for (int i = 0; i < n; i++) {

            String string = reader.readLine().toLowerCase();

            if (string.contains(alan)) {
                res++;
            }
        }

        System.out.println(res);
    }

}
