package SelectiveStructure.P;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Date shiyueerjiu = new Date("2020/10/29");

        String mydate = in.nextLine();
        Date now = new Date(mydate);

        if (now.before(shiyueerjiu)) {
            System.out.println("No. It's not too late.");
        } else {
            System.out.println("QAQ");
        }

    }
}
