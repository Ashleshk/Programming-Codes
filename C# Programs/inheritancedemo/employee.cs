//in inheritance the dafult ctor of base calss is called
//for paramertised of base class goto next project


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace inheritancedemo
{
    class employee
    {
        public int empid;
        public string ename;
        public int sal;
        public employee()
        {
            empid = 101;
            ename = "pikachu";
            sal=450;
            Console.WriteLine("default constructor of employee");
        }
        public employee(int id,string name,int s) 
        {
            empid = id; ename = name; sal = s;
            Console.WriteLine("parameterised constructor of employee");
        }
        public void calc()
        {
            Console.WriteLine("\nenter employee id:");
            empid = int.Parse(Console.ReadLine());
            Console.WriteLine( "enter employee name:");
            ename = Console.ReadLine();
            Console.WriteLine("enter employee salary:");
            sal=int.Parse(Console.ReadLine());
        }
    }
    class Manager : employee
    {
        public int payroll;
        public float bonus;
        public Manager()
        {
            payroll = 100;
            bonus = 500;
            Console.WriteLine("default constructor of manager");
        
        }

        public Manager(int pay, float bb)
        {
            payroll = pay; bonus = bb;
            Console.WriteLine("parameterised constructor of manager");
        }
        public void display()
        {
            Console.WriteLine("##########################################################");
            Console.WriteLine("employee id :" + empid);
            Console.WriteLine("employee name :" + ename);
            Console.WriteLine("employee sal :" + sal);
            Console.WriteLine("employee payroll :" + payroll);

            Console.WriteLine("employee bonus :" + bonus);

            Console.WriteLine("##########################################################");
         
        }
    }
}
