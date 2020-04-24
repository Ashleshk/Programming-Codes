using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace eventhandlingdemoexp
{    public delegate void del1();
class student
{
    public event del1 pass;
    public event del1 fail;

    public void getgrade(int marks)
    {
        if (marks < 30)
            fail();
        else
            pass();
    }
}
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("enter marks :");
            int marks = Convert.ToInt32(Console.ReadLine());
            student obj = new student();
            obj.pass += new del1(obj_pass);
            obj.fail += new del1(obj_fail);
            obj.getgrade(marks);
            Console.WriteLine("***************************");

            
        }
        static void obj_pass()
        {
            Console.WriteLine("student passs........");
        }
        static void obj_fail()
        {
            Console.WriteLine("student fial........");
        }
    }
}
