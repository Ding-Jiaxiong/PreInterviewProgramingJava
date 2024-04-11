package NowCoder.FunctionAndRecursion.O;

import com.sun.jndi.cosnaming.CNCtx;

import java.util.Scanner;

/*
   左根右
 */

class Node {
    int v;  // 节点值
    Node ls, rs; // 左右子

    public Node() {
        v = -1;
        ls = null;
        rs = null;
    }

    public Node(int v, Node ls, Node rs) {
        this.v = v;
        this.ls = ls;
        this.rs = rs;
    }
}


public class Solution {

    static int res[]; // 结果数组
    static int cnt = 0;  // 节点数

    static Node build(int l1, int r1, int l2, int r2, int[] pre, int[] suf) {
        if (l1 > r1 || l2 > r2) return null;
        Node nd = new Node();
        nd.v = pre[l1];
        int cnt = 0, p = r2;
        while (--p >= l2 && l1 + 1 <= r1) {
            if (pre[l1 + 1] == suf[p]) {
                break;
            } else {
                cnt++;
            }
        }
        nd.ls = build(l1 + 1, r1 - cnt, l2, r2 - cnt - 1, pre, suf);
        nd.rs = cnt == 0 ? null : build(r1 - cnt + 1, r1, r2 - cnt, r2 - 1, pre, suf);
        return nd;
    }

    static void inorder(Node node) {  // 中序遍历
        if (node == null) return;
        inorder(node.ls);
        res[cnt++] = node.v;
        inorder(node.rs);
    }

    public static int[] solve(int n, int[] pre, int[] suf) {

        Node node = build(0, n - 1, 0, n - 1, pre, suf);
        res = new int[n];

        inorder(node);
        return res;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] pre = new int[n];  // 先序遍历
        int[] suf = new int[n];  // 后序遍历

        for (int i = 0; i < n; i++) {
            pre[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            suf[i] = in.nextInt();
        }

        int[] solve = solve(n, pre, suf);

        for (int i : solve) {
            System.out.print(i + " ");
        }

    }

}
