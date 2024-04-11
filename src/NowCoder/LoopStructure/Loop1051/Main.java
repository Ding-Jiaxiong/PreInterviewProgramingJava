package NowCoder.LoopStructure.Loop1051;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String num_string = String.valueOf(num);

        int ans = 0;

        for (int i = 0; i < num_string.length(); i++) {

            ans += Character.getNumericValue(num_string.charAt(i));

        }

        System.out.println(ans);

    }

}
