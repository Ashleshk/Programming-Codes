using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Calculatordll
{
    public class Class1
    {
       public int m, n;
        public void Add(int a,int b)
        {
            Console.WriteLine(a+b);
        }
        public void Sub(int a, int b)
        {
            Console.WriteLine(a - b);
        }
        public void Mul(int a, int b)
        {
            Console.WriteLine(a * b);
        }
        public void Div(int a, int b)
        {
            Console.WriteLine(a / b);
        }
    }
}
