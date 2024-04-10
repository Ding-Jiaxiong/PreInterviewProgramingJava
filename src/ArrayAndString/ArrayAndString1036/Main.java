package ArrayAndString.ArrayAndString1036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        String lowerCase = string.toLowerCase();

        String sub_string = "bob";

        System.out.println(lowerCase.indexOf(sub_string));

    }
}
