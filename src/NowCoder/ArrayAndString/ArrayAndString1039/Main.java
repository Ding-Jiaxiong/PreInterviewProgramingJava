package NowCoder.ArrayAndString.ArrayAndString1039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        HashSet<Object> res = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);

            if (Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c)) {
                res.add(c);
            }
        }

        System.out.println(res.size());

    }

}
