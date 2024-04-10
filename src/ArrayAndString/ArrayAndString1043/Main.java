package ArrayAndString.ArrayAndString1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fangcheng = reader.readLine();

        char weizhishu = ' '; // 未知数字符

        /*
        思路: 依次读入, 强行模拟
         */

        int f = 1; // 当前项的正负号, 初始 1
        int now = 1; // 当前项的系数, 初始 1
        int k = 0;  // 未知数的系数, 初始 0
        int b = 0; // 常数项
        int x = 0;  // 正在构建的数字
        boolean r = false; // 是否正在构建数字【读取到数字】

        for (int i = 0; i < fangcheng.length(); i++) {

            char c = fangcheng.charAt(i);

            if (c == '-') {
                b += now * f * x;  // 读到符号就结算一下之前的常数项
                x = 0;
                f = -1;
                r = false;
            } else if (c == '+') {
                b += now * f * x; // 读到符号就结算
                x = 0;
                f = 1;
                r = false;
            } else if (c == '=') { // 到等号右边了
                b += now * f * x;  // 结算
                x = 0;
                f = 1;
                now = -1; // 等号右边都反一下
                r = false;
            } else if (Character.isLetter(c)) {

                if (r) {  // 如果有正在读入的数字
                    k += now * f * x;  // 未知数系数
                    x = 0;  // 重置正在构建的数字
                } else {
                    k += now * f;  // 没有也要加
                }

                weizhishu = c;
                r = false;

            } else if (Character.isDigit(c)) {

                x = x * 10 + c - '0';
                r = true;  // 正在构建数字
            }
        }

        // 最后归总一下常数项
        b += now * f * x;

        double ans = -b * 1.0 / k;

        // 特判
        if (ans == -0.0) {
            ans = 0;
        }


        System.out.printf("%c=%.3f", weizhishu, ans);
    }

}
