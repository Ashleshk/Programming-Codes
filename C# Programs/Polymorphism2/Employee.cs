using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Polymorphism2
{
    class Employee
    {
        public int id;
        public string name;
        public int basicSalary;

        public Employee()
        {
            id = 1;
            name = "Aditya";
            basicSalary = 1000;
        }
        public Employee(string n,int i,int s)
        {
            id = i;
            name = n;
            basicSalary = s;
        }

        public  virtual void calculateSalary()
        { 
        }
    }
}
