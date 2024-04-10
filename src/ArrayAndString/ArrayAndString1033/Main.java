package ArrayAndString.ArrayAndString1033;

import java.util.Scanner;

public class Main {

    public static void print_result(String info, int fenzhi) {

        char[] winorlose = info.toCharArray();

        int win = 0;  // 赢的局数
        int lose = 0;  // 输

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < winorlose.length && winorlose[i] != 'E'; i++) {

            if (winorlose[i] == 'W') {
                win++;
            } else if (winorlose[i] == 'L') {
                lose++;
            }

            // 如果分数超过2 了而且已经到达分制
            if (Math.max(win, lose) >= fenzhi && Math.abs(win - lose) >= 2) {
                builder.append(win + ":" + lose + "\n");
                win = 0; // 重置
                lose = 0;
            }

        }

        // 最后剩下的是当前的比分情况
        builder.append(win + ":" + lose + "\n");
        System.out.println(builder);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String competition_info = "";

        while (in.hasNextLine()) {

            String s = in.nextLine();
            if (s.isEmpty()) {
                break;
            }
            competition_info += s;
        }

        print_result(competition_info, 11);
        print_result(competition_info, 21);

    }

}
