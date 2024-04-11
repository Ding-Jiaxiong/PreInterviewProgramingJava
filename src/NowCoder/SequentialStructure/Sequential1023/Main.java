package NowCoder.SequentialStructure.Sequential1023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String num = in.nextLine();

        StringBuffer stringBuffer = new StringBuffer(num);

        String string = stringBuffer.reverse().toString();
        System.out.println(string);

    }

}
