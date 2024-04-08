package ArrayAndString.ArrayAndString1015;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LinkedList<Integer> integers = new LinkedList<>();

        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            integers.add(in.nextInt());
        }

        for (int i = 0; i < m; i++) {
            integers.add(in.nextInt());
        }

        Collections.sort(integers);

        for (Integer i : integers) {
            System.out.print(i + " ");
        }

    }

}
