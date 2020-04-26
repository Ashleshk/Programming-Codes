#include<iostream>
using namespace std;
void swapv(int ,int );
void swapr( int & ,int &);
void swapa(int *,int *);
int main()
{
  int a=10,b=20;
  swapv(10,20);  //call by value
  swapa(&a,&b);
  swapr(a,b);
 return 0;
}
void swapv(int i, int j)
 {
   int t;
   
  t=i;
   i=j;
   j=t;
  cout<<i<<j;
 }
void swapr(int &i, int &j)
 {
   int t;
   
   t=i;
   i=j;
   j=t;
 
 }
void swapa(int *i, int *j)
 {
   int t;
  
   t=*i;
   *i=*j;
   *j=t;
  
 }
