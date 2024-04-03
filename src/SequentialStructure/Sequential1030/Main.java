package SequentialStructure.Sequential1030;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("0");

        System.out.println(decimalFormat.format(age * 3.156 * Math.pow(10, 7)));

    }

}

// 忘了指数还可以用 e 了
//package SequentialStructure.Sequential1030;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        long age = in.nextLong();
//        age *= 3.156e7;
//
//        System.out.println(age);
//
//    }
//
//}
