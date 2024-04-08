package ArrayAndString.ArrayAndString1011;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        LinkedHashSet<Integer> integers = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            integers.add(in.nextInt());
        }

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

    }

}
