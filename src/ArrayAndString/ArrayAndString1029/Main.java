package ArrayAndString.ArrayAndString1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        LinkedList<Integer> integers = new LinkedList<>();

        String[] strings = reader.readLine().split(" ");

        for (String string : strings) {

            if (!integers.contains(Integer.parseInt(string))) {
                integers.add(Integer.parseInt(string));
            }

        }

        Collections.sort(integers);

        System.out.println(integers.size());
        for (Integer num : integers) {
            System.out.print(num + " ");
        }

    }

}
