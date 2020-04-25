using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace day_05
{
    class Program
    {
        static void Main( )
        {
            int a=20, b=10;
            Console.WriteLine("values before swapping:\na="+a+ "  b= "+b);
            swap(ref a, ref b);
            Console.WriteLine("values after swapping:\na=" + a + "   b= " + b);
        }
        public static void swap(ref int a, ref int b)
        {
            int temp;
            temp =a;
            a=b;
            b=temp;
        }
    }
}
