using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace CollectionsDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            //ArrayList obj = new ArrayList();
            //obj.Add(10);
            //obj.Add("Aditya");
            //foreach (var item in obj)
            //{
            //    Console.WriteLine(item);
            //}
            
        //    Stack s = new Stack();
        //    s.Push("Adi");
        //    //Console.WriteLine(s.ToString());
        //    Stack s1=(Stack)s.Clone();
        //    Console.WriteLine( s.GetHashCode());
        //    Console.WriteLine(s1.GetHashCode());
        //    //Console.WriteLine(s1.Pop()); 
        //

            Hashtable ht = new Hashtable();
            ht.Add(20,10);
            ht.Add(30, 10);
            ht.Add(40, 10);
            ht.Remove(10);
            foreach (var item in ht.Values)
            {
                Console.WriteLine(item);
            }
        }
    }
}
