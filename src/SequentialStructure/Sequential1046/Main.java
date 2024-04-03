package SequentialStructure.Sequential1046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stu = in.nextInt();
        int gaoshu = in.nextInt();
        int dawu = in.nextInt();

        System.out.printf("%d %d", Math.min(gaoshu, dawu), (gaoshu + dawu) <= stu ? 0 : (gaoshu + dawu - stu));

    }
}
