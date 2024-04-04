package SelectiveStructure.V;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tian = 0, max = 0;

        for (int i = 1; i <= 7; i++) {
            int school = in.nextInt();
            int home = in.nextInt();

            if ((school + home) > max && (school + home) > 8) {
                max = school + home;
                tian = i;
            }

        }

        System.out.println(tian);

    }

}
