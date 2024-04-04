package LoopStructure.Loop1016;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetter(c)) {

                res++;

            } else if (Character.isDigit(c)) {
                res++;
            }
        }

        System.out.println(res);

    }

}
