#include<iostream>
using namespace std;
int main()
{
	int arr[5]={300,350,200,400,250};
	int i;
	int max=0;
	 //����������ÿ��Ԫ�أ�������Ԫ�ر����϶������ֵҪ�󣬸������ֵ// 
	for(i=0;i<5;i++)  
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	cout<<"max="<<max; 
	return 0;
}
