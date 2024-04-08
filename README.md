模式: ACM
语言: Java

牛客网Java 判题注意事项:

- 类名必须为Main, 不能有任何包 package 信息【本地可以有, 提交不能有】
- 用while 处理多个case

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
- 