using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace UserDefinedException
{
    class Employee
    {
        public string Desi,name;
        public Employee(string de,string na)
        {
            Desi = de;
            name = na;
        }
        public void calculateSalary()
        {
            Console.WriteLine("\n I am in Calculate Bonus Method");
        }
    }

}
