using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace UserDefinedGenericClass
{
    class Program
    {
        static void Main(string[] args)
        {
            myStack<int> ms = new myStack<int>(5);
            ms.push(30);
            ms.push(20);
            ms.push(10);
            ms.pop();
            myStack<string> ms1 = new myStack<string>(3);
            ms1.push("Ad");
            ms1.push("it");
            ms1.push("ya");
            ms1.pop();
        }
    }
}
