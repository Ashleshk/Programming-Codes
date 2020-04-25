using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace shadowingdemo
{
    class Program
    {
        static void Main( )
        {
            sample2 ob = new sample2();
            Console.WriteLine(ob.i);
        }
    }
    class sample
    {
        public int i = 20;
    }
    class sample2 : sample 
    {
        public   int i = 30;                   //putting new makes shadowing concwept to appear
    }
      // no error exist if new is present or not ,,,, check for warning ........

}
