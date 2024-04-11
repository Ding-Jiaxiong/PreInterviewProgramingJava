#include<bits/stdc++.h>
using namespace std;
string s;
const int mod=65536;
bool flag=true;
int f[mod + 10];
#define ll long long

ll ksm(ll a,ll b,ll mod)
{
	ll ans=1;
	ll tmp=a;
	while(b)
	{
		if(b&1)ans=tmp*ans%mod;
		tmp=tmp*tmp%mod;
		b>>=1;
	}
	return ans;
}

int zhuan(int l,int r)
{
	int ans=0;
	for(int i=l;i<=r;i++)
	{
		ans=ans*10+s[i]-'0';
	}
	return ans;
}
int solve(int l,int r)
{
	int pos1=-1,pos2=-1,pos3=-1,pos4=-1;
	for(int i=l;i<=r;i++)
	{
		if(s[i]=='+'||s[i]=='-')
		pos1=i;
		if(s[i]=='*'||s[i]=='/')
		pos2=i;
		if(s[i]=='^')
		pos3=i;
		if(s[i]=='!')
		pos4=i;
	}
	if(pos1==-1&&pos2==-1&&pos3==-1&&pos4==-1)
	return zhuan(l,r);
	else if(pos1!=-1)
	{
		if(s[pos1]=='+')return ((solve(l,pos1-1)+solve(pos1+1,r))%mod);
		else return ((solve(l,pos1-1)-solve(pos1+1,r))%mod);
	}
	else if(pos2!=-1)
	{
		if(s[pos2]=='*')return ((solve(l,pos2-1)*solve(pos2+1,r))%mod);
		else
		{
			if(solve(pos2+1,r)==0)
			{
				flag=false;
			}
			else return ((solve(l,pos2-1)/solve(pos2+1,r))%mod);
		}
	}
	else if(pos3!=-1)
	{
		return ksm(solve(l,pos3-1),solve(pos3+1,r),mod);
	}
	else if(pos4!=-1)
	return f[solve(l,pos4-1)];
    return 0;
}
int main()
{
	int t;
	cin>>t;
	f[0]=1;
	for(int i=1;i<mod;i++)
        f[i] = f[i-1] * i % mod;
	while(t--)
	{
		cin >> s;
        flag=true;
		int ans=solve(0,s.size()-1);
		if(flag) cout<<ans<<endl;
		else cout<<"ArithmeticException"<<endl;
	}
	return 0;
}