using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace UserDefinedException
{
    class Program
    {
        static void Main(string[] args)
        {
            
            //try
            //{
            //    Employee e = new Employee("Employee", "Raj");
            //    if (e.Desi == "Employee")
            //        throw new myException("Calculate Bonus is not for Employee ");
            //    else
            //        e.calculateSalary();
            //}
            //catch (myException ex)
            //{
            //    Console.WriteLine(ex.error);
            //}
            LinkedList<string> n = new LinkedList<string>();
            LinkedListNode<string> n1 = new LinkedListNode<string>("A");
            LinkedListNode<string> n2 = new LinkedListNode<string>("B");
            LinkedListNode<string> n3 = new LinkedListNode<string>("C");
            LinkedListNode<string> n4 = new LinkedListNode<string>("D");
            n.AddFirst(n1);
            n.AddAfter(n1, n2);
            n.AddAfter(n2, n3);
            n.AddAfter(n3, n4);
            foreach (var item in n)
            {
                Console.WriteLine(item);
                
            }


        }
    }
}
