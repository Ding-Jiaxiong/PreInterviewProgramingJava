package ArrayAndString.ArrayAndString1038;

import java.io.*;
import java.util.*;

public class Main {

    /**
     * 三短一长选最长
     * 三长一短选最短
     * 参差不齐就C
     */

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {  // n 道题

            String[] s = new String[4];

            for (int j = 0; j < 4; j++) { // 每道题4个选项

                s[j] = in.readLine();

            }

            Arrays.sort(s, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });

            if (s[0].length() < s[1].length()) {  // 一定就是三长一短
                out.println(s[0].charAt(0));
            } else if (s[3].length() > s[2].length()) {
                out.println(s[3].charAt(0));
            } else {
                out.println("C");
            }
            out.flush();

        }


    }

}
