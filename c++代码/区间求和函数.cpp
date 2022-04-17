#include<iostream>
using namespace std;
int sum(int begin,int end)
{
	int i;
	int sum=0;
	for(i=begin;i<=end;i++)
	{
		sum=sum+i;
	}
	return sum;
}
int main()
{
	int m,n;
	cout<<"请输入要求和区间的区间值:"<<endl;
    cin>>m;
    cin>>n;
	cout<<"区间的和为："<<sum(m,n);
	return 0;
} 
