package NowCoder.FunctionAndRecursion.W;

/**
 * 这种python 又秒了
 *````
 * s=input()
 * s=s.replace('^',"**")
 * s=s.replace('/','//')
 * a=s.count('(')
 * b=s.count(')')
 * if a>b: # 多余括号情况
 *     s=s+(a-b)*')'  # 补上右括号
 * elif b>a:
 *     s=(b-a)*'('+s  # 补上左括号
 * print(eval(s))
 *````
 */

import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int len = 0;
    static char s[] = new char[35];

    static int kp(int b, int k) {
        int res = 1;
        while (k > 0) {
            if (k % 2 == 1) {
                res *= b;
            }
            b *= b;
            k /= 2;
        }
        return res;
    }

    static int getNum(int l, int r) {
        int x = 0;
        for (int i = l; i <= r; ++i) {
            x = (x << 3) + (x << 1) + (s[i] ^ 48);
        }
        return x;
    }

    static int solve(int l, int r) {
        if (l > r) return 0;
        int p1 = -1, p2 = -1, p3 = -1, cur = 0;
        for (int i = l; i <= r; ++i) {
            if (s[i] == '(') ++cur;
            if (s[i] == ')') --cur;
            if (cur <= 0) {
                if (s[i] == '-' || s[i] == '+') p1 = i;
                else if (s[i] == '*' || s[i] == '/') p2 = i;
                else if (s[i] == '^') p3 = i;
            }
        }
        if (p1 == -1 && p2 == -1 && p3 == -1) {
            if (cur == 0 && s[l] == '(') return solve(l + 1, r - 1);
            else if (cur > 0 && s[l] == '(') return solve(l + 1, r);
            else if (cur < 0 && s[r] == ')') return solve(l, r - 1);
            return getNum(l, r);
        }

        if (p1 != -1) {
            if (s[p1] == '+') return solve(l, p1 - 1) + solve(p1 + 1, r);
            else return solve(l, p1 - 1) - solve(p1 + 1, r);
        } else if (p2 != -1) {
            if (s[p2] == '*') return solve(l, p2 - 1) * solve(p2 + 1, r);
            else return solve(l, p2 - 1) / solve(p2 + 1, r);
        } else if (p3 != -1) {
            return kp(solve(l, p3 - 1), solve(p3 + 1, r));
        }
        return 0;
    }

    static int ins() throws IOException {
        char c = (char) in.read();
        while (!(c >= 48 && c <= 57 || c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')'))
            c = (char) in.read();
        while (c >= 48 && c <= 57 || c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')') {
            s[len++] = c;
            c = (char) in.read();
        }
        return solve(0, len - 1);
    }

    public static void main(String[] args) throws IOException {
        System.out.printf("%d\n", ins());
    }
}