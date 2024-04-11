模式: ACM
语言: Java

牛客网Java 判题注意事项:

- 类名必须为Main, 不能有任何包 package 信息【本地可以有, 提交不能有】
- 用while 处理多个case

### 一、牛客网学习

#### 0. OJ在线编程常见输入输出练习场

https://ac.nowcoder.com/acm/contest/5657

#### 1. 牛客竞赛语法入门班顺序结构习题

https://ac.nowcoder.com/acm/contest/18839

- 四则运算除法 / , 用double型转换一下, 不然结果是整型
- StringBuffer 可直接用于一个字符串的翻转, ``
    ````
    String num = in.nextLine();

    StringBuffer stringBuffer = new StringBuffer(num);

    String string = stringBuffer.reverse().toString();
    ````
- 三角形海伦公式: 根据三边长直接算面积
- 大数不用科学计数法显示: DecimalFormat 【当然long 类型乘以科学计数法也可以】
- 已知长方体一个顶点的三面面积, 求棱长合【数学题】
  ````
  System.out.println(4 * (int) Math.sqrt(a * b / c + a * c / b + b * c / a + (a + b + c) * 2));
  ````
- ``a+b+c>= 3 * ³√abc``
- n = p^k -->变形得k = logp(n)（以p为底数，n为真数的对数函数） 【数学题】
- 塞瓦维特斯定理：已知a,b为大于1的正整数,gcd(a,b)=1,则使不定方程ax+by=C不存在非负整数解的最大整数C=a×b−a−b

#### 2. 牛客竞赛语法入门班选择结构习题

https://ac.nowcoder.com/acm/contest/19304

- 在地图中从 0,0 走到 a,b , 当然a + b 是最短的走法, 如果绕路, 要想在n 内走到, 那a + b 和n 肯定有相同的奇偶性
- (四年一闰、百年不闰)、四百年又闰 `( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)`
- Date 直接进行比较可以用 `after` 和 `before`
- LocalDate 更加好用, 好用, 日期操作建议直接上这个
- Java 中可以使用 `% 1` 的方式判断一个浮点数是不是整数
- van纸牌, 左右各减对方的一半，最后减去对方, 结果最优解 【三轮】
  ````
  left -= right / 2;
  right -= left / 2;
  left -= right;
  ````
- Java中向上取整 → `Math.ceil()` 向下取整 → `Math.floor()`
- `Character.getNumericValue(at)` 可以直接将数字字符转为对应数字, 而不是ASCII 码
- Java 如果只想操作某个指定位置的字符，可以先转成 StringBuffer
- `String.valueOf()`  可以直接将数字转为字符串

#### 3. 牛客竞赛语法入门班循环结构习题

https://ac.nowcoder.com/acm/contest/19305

- 数字金字塔: 用额外变量控制要输出的数
- `Long.bitCount()`方法用于查找long类型给定参数[value]的2的补码二进制表示形式中的1的位数。`
- 判断n 是否是素数: 2 ~ n -1 这些数都不能整除n。也可以砍一半,  `i <= Math.sqrt(n)`
- Java Int类型取值范围大概是 `10^9`
- 感觉循环这一节非常多的题就是得数学好

#### 4. 牛客竞赛语法入门班数组字符串习题

https://ac.nowcoder.com/acm/contest/19306

- 计算方差的函数

````
    /**
     * 计算方差的函数
     */
    public static double calVariance(double[] numbers) {

        int n = numbers.length;

        double mean = 0.0;

        for (double x : numbers) {
            mean += x;
        }

        mean /= n;

        double variance = 0;
        for (double x : numbers) {

            variance += (x - mean) * (x - mean);
        }

        variance /= n;

        return variance;
    }
```` 

- 约瑟夫环的规律解法:

````
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // n个人
        int k = in.nextInt(); // k 开始报数
        int m = in.nextInt(); // m 出列

        int p = 0;  // 假装指针

        for (int i = 2; i <= n; i++) {

            p = (p + m) % i;
        }

        System.out.println((p + k) % n); // 纯纯规律啊

    }

}

````

- 有时候不要把问题想的太复杂
- Java 中有序集合 → `LinkedHashSet`
- Java 有序数组插入一个数, 可以直接插, 完事儿再排个序
- **杨辉三角的规律:**

1. 第几行就有几个数
2. 每行的第一个和最后一个数都是1
3. 其余的当前值 = 上一行当前列 + 上一行当前列左边那个值

- Java 常用flag 用于条件判断跳出
- Java使用StreamTokenizer 类快速读取int或long范围内的输入流
  https://blog.csdn.net/qq_38874164/article/details/137173266
- n阶方阵, 沿着相邻两条边中点, 中间封闭图形区域数字的和有规律

````
long n = in.nextLong();  // n阶方阵
System.out.println(((n / 2) * (n + 1) + 1) * ((n / 2) * (n + 1) + 1));
````

- 等差数列前n项和公式:

````
①Sn=n*a1+n(n-1)d/2。 ②Sn=n(a1+an)/2
````

- 判断数独, HashSet 集合
- `return;` 直接结束程序执行
- Java比Scanner快的一种读入数据的方法: `BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));`


- Java 回形数字矩阵

````
        while (num <= n * n) {

            while (y < n && arr[x][y + 1] == 0) arr[x][++y] = num++;  // 往右走
            while (x < n && arr[x + 1][y] == 0) arr[++x][y] = num++;  // 往下走
            while (y > 1 && arr[x][y - 1] == 0) arr[x][--y] = num++;  // 往左走
            while (x > 1 && arr[x - 1][y] == 0) arr[--x][y] = num++;  // 往上走

        }
````

- Java 蛇形数字矩阵

````
        for (int i = 1; i <= 2 * n - 1; i++) {

            int col = 1; // 列
            int row = i; // 行

            while (row >= 1) {

                if (col <= n && row <= n) {

                    if (i % 2 != 0) {  // 奇数行
                        snakematrix[row][col] = cnt++;
                    } else { // 偶数行

                        snakematrix[col][row] = cnt++;
                    }

                }

                row--;
                col++;

            }

        }
````

- Java ACM 静态内部类, 实现比较接口
- Comparable 接口中的 compareTo 方法实现:
  如果调用对象小于比较对象，则返回负值 ; 如果调用对象等于比较对象，则返回0 ;如果调用对象大于比较对象，则返回正值

````
        @Override
        public int compareTo(Point o) {
            if (this.dis > o.dis) return 1;
            else if (this.dis < o.dis) return -1;
            else return 0;
        }
````

- Java 直接查出子字符串的起始位置: `indexof()`
- Java 字符串转小写: `toLowerCase()`
- Character 类中有很多可以判断字符属性的方法
- 可变字符串 → `StringBuilder`
- 一道经典的字符模拟: `一元一次方程求解`

````
package NowCoder.ArrayAndString.ArrayAndString1043;

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

````

- 一道模拟译码题【字符串模拟】

例如输入000021757511222，每五位编号对应于一个字符串

编号00002对应字符串 aac

编号17575对应字符串 zzz

编号11222对应字符串 qpq

故输出为 aaczzzqpq

````
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String turn(String s) {

        int n = Integer.parseInt(s);
        int[] box = new int[4];

        int index = 0;
        while (n >= 26) { // 26进制

            box[index] = n % 26;
            n = n / 26;
            index++;
        }

        box[index] = n % 26;
        char[] ans = new char[3];

        for (int i = 0; i < 3; i++) {
            ans[i] = (char) ('a' + box[i]);
        }

        return ("" + ans[2] + ans[1] + ans[0]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        while (T-- != 0) {

            int n = Integer.parseInt(reader.readLine());
            String string = reader.readLine();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < string.length(); i += 5) {

                sb.append(turn(string.substring(i, i + 5)));
            }

            System.out.println(sb.toString());

        }

    }
}

````

#### 5. 牛客竞赛语法入门班函数与递归习题

https://ac.nowcoder.com/acm/contest/19859

- Java 根据年月生成当月所有日期:

````
    public static List<LocalDate> getAllDatesInMonth(int year, int month) {
        List<LocalDate> dates = new ArrayList<>();
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.withDayOfMonth(firstDayOfMonth.lengthOfMonth());

        // 使用日期范围来填充列表
        for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
            dates.add(date);
        }

        return dates;
    }

````

- Java 大数: `BigInteger int1 = new BigInteger(num1);` 这是整数类
- Java 大浮点数: `BigDecimal`

- 使用数字包装类对字符串进行解析时，可以指定进制

````
Long num1 = Long.parseLong(m, n);
````

- Java 判断一个数是不是完全平方数: `Math.sqrt(n) % 1 == 0;`
- Java 通过多边形顶点坐标直接计算多边形面积，格林公式
````
    public static double calArea(double[] x, double[] y) {

        int n = x.length;
        double area = 0.0;

        for (int i = 0; i < n; i++) {

            int j = (i + 1) % n;
            area += x[i] * y[j] - x[j] * y[i];
        }

        area = Math.abs(area) / 2.0;

        return area;
    }
````

- Java 四舍五入保留整数 → `(int) Math.round(num)`

- Java 已知中序和后序求先序

````
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
````

- Java 已知先序和后序求中序
````
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

````
- Java 汉诺塔问题求解步数
````
    public static void hannuo(int n, char a, char b, char c) {

        if (n == 1) ans += 2;
        else {

            hannuo(n - 1, a, b, c);
            ans++;
            hannuo(n - 1, c, a, b);
            ans++;
            hannuo(n - 1, b, a, c);

        }
    }
````

- 表达式求值那种题, 换python `eval()` 函数秒解

> 总结, 这一部分后面的题都有难度, 有些Java 和 Python 都会超时

### 二、厂子刷题

#### 1. 华为

##### 1.1 递归

`LeetCode 70/112/509`

- Java 根据二叉树的层序遍历数组【如果有null要用Integer】把这棵树给构建出来

````
    public static TreeNode buildTreeFromArray(Integer[] array) { // 使用队列把这棵树构建出来
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < array.length; i++) {
            TreeNode parent = queue.peek();
            if (parent == null) {
                continue;
            }

            TreeNode newNode = null;
            if (array[i] != null) {
                newNode = new TreeNode(array[i]);
                queue.offer(newNode);
            }

            if (i % 2 == 1) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
                queue.poll(); // Move to the next level
            }
        }

        return root;
    }
````

- Java 根据数组构建链表

````
    private static ListNode buildLinkedList(int[] values) {  // 根据数组构建链表
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
````
- LeetCode23 合并K个有序链表【Java ACM模式】
````
package Company.Huawei.DivideAndRule.LeetCode23;

import java.util.List;

/**
 * 分治
 */

public class Main {

    public static ListNode mergeKLists(ListNode[] lists) {

        return merge(lists, 0, lists.length - 1);
    }

    public static ListNode merge(ListNode[] lists, int l, int r) {

        if (l == r) return lists[l]; // 已经合并完了
        if (l > r) return null;

        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));

    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) { // 合并两个链表

        if (a == null || b == null) return a != null ? a : b;

        // 两个都不为空继续
        ListNode head = new ListNode(0);
        ListNode tail = head; // 尾结点也指着第一个
        ListNode aPtr = a, bPtr = b;  // 分别指向a 、b链表

        while (aPtr != null && bPtr != null) {  // 两个都不为空了说明遍历完了

            if (aPtr.val < bPtr.val) {

                tail.next = aPtr;
                aPtr = aPtr.next;  // 继续读
            } else {

                tail.next = bPtr;
                bPtr = bPtr.next;
            }

            tail = tail.next; // tail 也往后走一步
        }

        // 剩下的
        tail.next = aPtr != null ? aPtr : bPtr;
        return head.next;   // head没用
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    private static ListNode buildLinkedList(int[] values) {  // 根据数组构建链表
        ListNode dummy = new ListNode(); // 这个节点最后不会要的
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        int[][] linkedlistarray = new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}};

        ListNode[] lists = new ListNode[linkedlistarray.length];

        for (int i = 0; i < linkedlistarray.length; i++) {

            ListNode node = buildLinkedList(linkedlistarray[i]);
            lists[i] = node;
        }

        ListNode node = mergeKLists(lists);
        printLinkedList(node);

    }

}

/**
 * 链表节点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

````