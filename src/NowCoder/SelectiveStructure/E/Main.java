package NowCoder.SelectiveStructure.E;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long X = in.nextLong();
        long Y = in.nextLong();

        long Z;

        if (Y % X == 0) {
            Z = X + Y;
        } else {
            Z = Y - X;
        }

        System.out.println(Z);
    }

}
