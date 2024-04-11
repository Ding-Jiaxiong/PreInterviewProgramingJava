package NowCoder.SelectiveStructure.Q;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LocalDate localDate = LocalDate.parse(in.nextLine());

        LocalDate minusDays = localDate.minusDays(2);

        System.out.println(minusDays);

    }
}
