package NowCoder.LoopStructure.Loop1038;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ans = 0;

        while (true) {

            String string = in.nextLine();

            if (string.equals(".")) {
                break;
            } else {

                for (int i = 0; i < string.length(); i++) {

                    char at = string.charAt(i);
                    if (at == 'a') {
                        ans++;
                    }
                }

            }

        }

        System.out.println(ans);

    }

}
