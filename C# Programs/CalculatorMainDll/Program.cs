using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Calculatordll;

namespace CalculatorMainDll
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 c1 = new Class1();
            c1.Add(2, 3);
            c1.Div(10, 2);
        }
    }
}
