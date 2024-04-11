package FunctionAndRecursion.R;

import java.io.*;

public class Main {
    static int mxm = 1000005;
    static int tree[][] = new int[mxm][2], a[] = new int[mxm], mx;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    static int ini() throws IOException {
        int x = 0, c = in.read(), f = 1;
        while (c < 48 || c > 57) {
            if (c == '-') f = -1;
            c = in.read();
        }
        while (c >= 48 && c <= 57) {
            x = (x << 3) + (x << 1) + (c ^ 48);
            c = in.read();
        }
        return x * f;
    }

    static boolean dfs(int l, int r) {
        if (l == -1 && r == -1) return true;
        if (l == -1 || r == -1) return false;
        if (a[l] != a[r]) return false;
        mx += 2;
        return dfs(tree[l][0], tree[r][1]) && dfs(tree[l][1], tree[r][0]);
    }

    public static void main(String[] args) throws IOException {
        int n = ini(), t = 0, i = 0, ans = 1;
        for (i = 1; i <= n; ++i) {
            a[i] = ini();
        }
        for (i = 1; i <= n; ++i) {
            tree[i][0] = ini();
            tree[i][1] = ini();
        }
        for (i = 1; i <= n; ++i) {
            mx = 1;
            if (dfs(tree[i][0], tree[i][1])) {
                ans = Math.max(ans, mx);
            }
        }
        System.out.printf("%d\n", ans);
    }
}