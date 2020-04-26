#include<stdio.h>
int mul(int a, int b)
{
	int number1= a;
	int number2=b;
	return ((number1+number2),(number1*number2));       //only right most value is writtem
}
int main()
{
		int sum=0, multi = 0;
		multi,sum=mul(2,3);
		printf("sumand multiplication of two numbers asr %d,%d",sum,multi);
		scanf("%d",&multi);
		return 0;
}
