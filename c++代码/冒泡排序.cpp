#include<iostream>
using namespace std;
int main()
{
	int arr[9]={4,2,8,0,5,7,1,3,9};
	int i,j;
	int t;
	for(i=0;i<9-1;i++)
	{
		for(j=0;j<9-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
	}
	for(i=0;i<9;i++)
	{
		cout<<arr[i]<<" ";
	}
	return 0;
} 
