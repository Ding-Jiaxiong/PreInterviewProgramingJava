package ArrayAndString.ArrayAndString1048;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int n = in.nextInt();

            String[] seats = new String[n + 10];

            for (int i = 0; i < n; i++) {

                seats[i] = in.next();
            }

            boolean flag = false;  // 是否有这样的位置

            for (int i = 0; i < n; i++) {

                StringBuilder builder = new StringBuilder(seats[i]);

                if (seats[i].substring(0, 2).equals("OO")) {

                    flag = true;
                    builder.replace(0, 2, "++");
                    seats[i] = builder.toString();
                    break;

                } else if (seats[i].substring(3, 5).equals("OO")) {

                    flag = true;
                    builder.replace(3, 5, "++");
                    seats[i] = builder.toString();
                    break;
                }

            }

            if (flag) {
                System.out.println("YES");

                for (int i = 0; i < n; i++) {
                    System.out.println(seats[i]);
                }

            } else {
                System.out.println("NO");
            }

        }

    }

}
