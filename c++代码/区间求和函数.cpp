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
	cout<<"������Ҫ������������ֵ:"<<endl;
    cin>>m;
    cin>>n;
	cout<<"����ĺ�Ϊ��"<<sum(m,n);
	return 0;
} 
