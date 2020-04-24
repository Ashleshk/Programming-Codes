using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Calculatordll
{
    class Employee
    {
        int id;
        string s;
        public Employee()
        {
            id = 12;
            s = "Abc";
        }
        public void Display()
        {
            Console.WriteLine("\n Hello i am in the read Method");
        }
    }
}
