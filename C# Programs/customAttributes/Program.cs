using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace customAttributes
{
   
    class Program
    {
        static void Main(string[] args)
        {
            classCustom c1 = new classCustom();
            Type tp=c1.GetType();
            object[] arr = tp.GetCustomAttributes(false);
            foreach (object i in arr)
            {
               Employee e = (Employee)i;

                Console.WriteLine(e.name);
            }
            Console.ReadLine();

        }
    }
}
