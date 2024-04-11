#include<bits/stdc++.h>

// 用Java 就过不了一点, 超时

using namespace std;
int n;
int t[5];
int s[15][5];
void show()
{
    for(int i=1; i<=3*(2*n+1)+4;i++)
        printf(".");
    printf("\n");
    for(int i=n+1;i>=1;i--)//从最顶层开始打印
    {
        for(int j=1;j<=3;j++)//分为三根柱子区域
        {
            for(int k=1;k<=n+1-s[i][j];k++) printf(".");
            for(int k=1;k<=s[i][j];k++) printf("*");
            printf("%c",s[i][j]?'*':'|');
            for(int k=1;k<=s[i][j];k++) printf("*");
            for(int k=1;k<=n-s[i][j];k++) printf(".");
        }
        printf(".");//第3根柱子右边多了一个.
        printf("\n");
    }
}
void move(int sta, int en)
{
    s[++t[en]][en]=s[t[sta]][sta];
    s[t[sta]--][sta]=0;
    for(int i=1; i<=3*(2*n+1)+4; i++)
        putchar('-');
    putchar('\n');
    show();
}
void hanoi(int sta,int tmp, int en, int k)
{
    if(k==1)
        move(sta, en);
    else
    {
        hanoi(sta, en, tmp, k-1);
        move(sta, en);
        hanoi(tmp, sta, en, k-1);
    }
}
int main()
{
    cin>> n;
    for(int i=1; i<=n; i++)
    {
        s[++t[1]][1]=n-i+1;
    }
//     t[1]=n;
    show();
    if(n%2==0)
        hanoi(1, 2, 3, n);
    else
        hanoi(1, 3, 2, n);
    return 0;
}