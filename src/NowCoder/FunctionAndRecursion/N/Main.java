package NowCoder.FunctionAndRecursion.N;

import java.util.Scanner;

public class Main {

    public static void xianxu(String zhongxu, String houxu) {

        char root = houxu.charAt(houxu.length() - 1);  // 根节点
        System.out.print(root);

        int index = zhongxu.indexOf(root);  // 根节点在中序遍历序列中的索引位置

        if (index > 0) {
            xianxu(zhongxu.substring(0, index), houxu.substring(0, index));
        }

        if (index < zhongxu.length() - 1) {
            xianxu(zhongxu.substring(index + 1), houxu.substring(index, houxu.length() - 1));
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String zhongxu = in.nextLine(); // 左根右
        String houxu = in.nextLine();   // 左右根

        // 先序: 根左右
        xianxu(zhongxu, houxu);

    }

}
