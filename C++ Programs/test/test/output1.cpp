#include<string.h>
#include<iostream>
using namespace std;
class C
{
  public:
  int var1;
};
int main(int argc, char *argv[])
{
  C c1;
  c1.var1 = 1;
  C c2(c1);
  cout << "value of c2.val " << c2.var1;
  return 0;
}