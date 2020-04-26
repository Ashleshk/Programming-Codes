#include"name.h"
#include"header.h"
using namespace space1;
int main()
{
   inum=10;
   fun();
   using namespace space2;
   space3::fun();
   space2::fun();
   return 0;
}