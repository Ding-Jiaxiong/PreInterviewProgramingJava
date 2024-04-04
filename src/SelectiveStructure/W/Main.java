package SelectiveStructure.W;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String OLD_ISBN = in.nextLine();

        String replaced_ISBN = OLD_ISBN.replace("-", "");

        char yuanshibiema = replaced_ISBN.charAt(replaced_ISBN.length() - 1);

        int jisuanshibiema = 0;
        for (int i = 0; i < 9; i++) {
            char at = replaced_ISBN.charAt(i);
            jisuanshibiema += Character.getNumericValue(at) * (i + 1);
        }

        jisuanshibiema = jisuanshibiema % 11;
        char res;
        if (jisuanshibiema == 10) {
            res = 'X';
        } else {
            res = String.valueOf(jisuanshibiema).charAt(0);
        }

        if (res == yuanshibiema) {
            System.out.println("Right");
        } else {
            // 拼接出正确的ISBN
            StringBuffer buffer = new StringBuffer(OLD_ISBN);
            buffer.setCharAt(OLD_ISBN.length() - 1, res);

            System.out.println(buffer.toString());
        }

    }

}
