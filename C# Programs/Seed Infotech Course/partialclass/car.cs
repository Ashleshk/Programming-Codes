using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace partialclass
{
    partial class car
    {
        public int carno;
        public string name;
        public static void method()
        {
          Console.WriteLine("carno");
           
        }
        partial void add(int a ,int b)
        {
            Console.WriteLine(a+b);
        }
    }
}
