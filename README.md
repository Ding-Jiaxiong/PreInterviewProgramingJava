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
-  ``a+b+c>= 3 * ³√abc``
- n = p^k  -->变形得k = logp(n)（以p为底数，n为真数的对数函数） 【数学题】
- 塞瓦维特斯定理：已知a,b为大于1的正整数,gcd(a,b)=1,则使不定方程ax+by=C不存在非负整数解的最大整数C=a×b−a−b