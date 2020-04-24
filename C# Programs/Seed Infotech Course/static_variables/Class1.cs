using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace static_variables
{
    class Class1
    {
        public int empid;
        public string ename;
        public int sal;
        public static int count = 0;

        public Class1()
        {
            count++;
            empid = count;
            ename = "ram";
            sal = 25000;

        }
        public Class1(String name, int sal)
        {
            count++;
            empid = count;

            ename = name;
            this.sal = sal;
        }
        public void display()
        {
            
           Console.WriteLine("emplyee id:"+empid);
           Console.WriteLine("emplyee name:" + ename); 
            Console.WriteLine("emplyee sal:" + sal);
        }
    }
}
