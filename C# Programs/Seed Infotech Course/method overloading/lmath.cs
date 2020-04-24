using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace method_overloading
{
    class lmath
    {
        public void add(int x,int y)
        {
            Console.WriteLine(x+y);
        }
        public void add(int x, double y)
        {
            Console.WriteLine(x + y);
        }
        public void add(double x, int y)
        {
            Console.WriteLine(x + y);
        }
        public void add(double x, double y)
        {
            Console.WriteLine(x + y);
        }
    }
}
