using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Polymorphism2
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee e = new Manager();
            e.calculateSalary();
            Console.WriteLine(e);
            Employee e1 = new President(100, 200, 500, "Ash", 1, 50000);
            Console.WriteLine(e1);
        }
    }
}
