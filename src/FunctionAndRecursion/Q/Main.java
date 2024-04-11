package FunctionAndRecursion.Q;

import java.io.*;

public class Main {
    static int n;
    static int[] a;
    static int[][] vis;
    static int p = 1;
    static boolean flag = true;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    static int ini() throws IOException {
        int x = 0, c = in.read();
        while (c < 48 || c > 57) {
            if (c == -1) return -1;
            c = in.read();
        }
        while (c >= 48 && c <= 57) {
            x = (x << 3) + (x << 1) + (c ^ 48);
            c = in.read();
        }
        return x;
    }

    static void dfs(int l, int r) {
        if (l > r || l < 1 || r > n) return;
        int pos = vis[l][r];
        if (p != n) {
            System.out.printf("%d ", pos);
        } else {
            System.out.printf("%d\n", pos);
        }
        p++;
        dfs(l, pos - 1);
        dfs(pos + 1, r);
    }

    public static void main(String[] args) throws IOException {
        n = ini();
        a = new int[n + 2];
        vis = new int[n + 2][n + 2];
        int[][] dp = new int[n + 2][n + 2];
        for (int i = 1; i <= n; ++i) {
            a[i] = ini();
            dp[i][i] = a[i];
            vis[i][i] = i;
        }
        for (int l = 2; l <= n; ++l) {
            for (int i = 1; i <= n - l + 1; ++i) {
                int j = i + l - 1;
                int t = 0;
                for (int k = i; k <= j; ++k) {
                    if (k == i) {
                        t = dp[i][k] + dp[k + 1][j];
                        int i1 = dp[i][k - 1] + dp[k][j];
                    } else if (k == j) {
                        t = dp[i][k - 1] + dp[k][j];
                    } else {
                        t = dp[i][k - 1] * dp[k + 1][j] + dp[k][k];
                    }
                    if (t > dp[i][j]) {
                        dp[i][j] = t;
                        vis[i][j] = k;
                    }
                }
            }
        }
        System.out.printf("%d\n", dp[1][n]);
        dfs(1, n);
    }
}
