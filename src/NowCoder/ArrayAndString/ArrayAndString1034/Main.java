package NowCoder.ArrayAndString.ArrayAndString1034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split(" ");

        String niuniu = strings[0];
        String niumei = strings[1];

        if (niuniu.equals("elephant")) {

            if (niumei.equals("mouse")) {
                System.out.println("tiangou txdy");
            } else {
                System.out.println("tiangou yiwusuoyou");
            }

        } else if (niuniu.equals("tiger")) {

            if (niumei.equals("elephant")) {
                System.out.println("tiangou txdy");
            } else {
                System.out.println("tiangou yiwusuoyou");
            }

        } else if (niuniu.equals("cat")) {

            if (niumei.equals("tiger")) {
                System.out.println("tiangou txdy");
            } else {
                System.out.println("tiangou yiwusuoyou");
            }

        } else if (niuniu.equals("mouse")) {

            if (niumei.equals("cat")) {
                System.out.println("tiangou txdy");
            } else {
                System.out.println("tiangou yiwusuoyou");
            }

        }

    }

}
