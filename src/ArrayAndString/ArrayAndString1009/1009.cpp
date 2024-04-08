#include<stdio.h>

int main()
{
    int m,n;
    scanf("%d %d",&n,&m);
    int i,sum,j,course[m],number,ans=0;
    for(i=0;i<m;i++)
        course[i]=0; //course[i]表示喜欢课程i+1的人数
    for(i=0;i<n;i++)
    {
        scanf("%d",&sum);
        for(j=0;j<sum;j++)
        {
            scanf("%d",&number);
            course[number-1]++; //统计：喜欢课程number的人数+1
        }
    }
    for(i=0;i<m;i++)
    {
        if(course[i]==n)
        //当所有人都喜欢课程i+1
        ans++;
    }

    printf("%d",ans);
    return 0;
}