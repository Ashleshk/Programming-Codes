using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace paramsdemo
{
    class Program
    {
        static void Main(string[] args)
        {
            lath1 ac = new lath1();
            ac.fun(5,5);
            ac.fun();
            ac.fun(6,42,6,54,46,346,376,346,2357,5);
        }
    }
}
