package SelectiveStructure.C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if (x == y) {
            System.out.println("Tacit！");
        } else {
            System.out.println("No Tacit!");
        }

    }
}
