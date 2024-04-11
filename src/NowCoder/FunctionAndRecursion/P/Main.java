package NowCoder.FunctionAndRecursion.P;

import java.util.Scanner;

public class Main {

    public static void Fbi_Tree(String s) {

        if (s.length() == 1) {
            if (s.equals("1")) System.out.print("I");
            if (s.equals("0")) System.out.print("B");

            return;
        }

        String s1 = s.substring(0, s.length() / 2);// 左子树
        String s2 = s.substring(s.length() / 2);// 右子树

        Fbi_Tree(s1);
        Fbi_Tree(s2);

        if (s.indexOf("0") == -1) System.out.print("I");
        else if (s.indexOf("1") == -1) System.out.print("B");
        else System.out.printf("F");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 无用

        String s = in.next();

        Fbi_Tree(s);

    }

}
