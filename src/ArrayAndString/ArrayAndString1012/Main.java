package ArrayAndString.ArrayAndString1012;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        LinkedList<Integer> integers = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            integers.add(in.nextInt());
        }

        int M = in.nextInt();

        integers.add(M);

        Collections.sort(integers);

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

    }

}
