using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Polymorphism2
{
    class Manager:Employee
    {
        int netSalary;
        int petrol, food, other;
        public Manager()
        {
            petrol = 0;
            food = 0;
            other = 0;
        }
        public override void calculateSalary()
        {
            petrol=(base.basicSalary * 8) / 100;
            food=(base.basicSalary * 13) / 100;
            other = (base.basicSalary * 3) / 100;
            netSalary = (base.basicSalary) +petrol+food+other;
        }
        public override string ToString()
        {
            return "Net salary of Manager is: " + netSalary;
        }
    }
   
}