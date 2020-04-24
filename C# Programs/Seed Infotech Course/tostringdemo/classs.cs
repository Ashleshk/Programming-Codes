using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace tostringdemo
{
    class classs
    {
        public int empid;
        public string ename;
        public int sal;
        public static int count = 0;

        public classs()
        {
            count++;
            empid = count;
            ename = "ram";
            sal = 25000;

        }
        public classs(String name, int sal)
        {
            count++;
            empid = count;

            ename = name;
            this.sal = sal;
        }
        public override string ToString()
        {
            return empid+" "+ename+" "+sal ;
        }
        public void display()
        {

            Console.WriteLine("emplyee id:" + empid);
            Console.WriteLine("emplyee name:" + ename);
            Console.WriteLine("emplyee sal:" + sal);
        }
    }
}
