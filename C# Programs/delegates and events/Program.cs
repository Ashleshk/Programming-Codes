using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace delegates_and_events
{
    public delegate void del1(int a, int b );
    class Program
    {   
        static void Main(string[] args)
        {
            del1 obj = new del1(imath.add);
            obj.Invoke(5, 7);
            Console.WriteLine("***************************");
            obj(5,7);
            Console.ReadLine();
        }
    }
}
