using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace writelinedemo
{
    class Program
    {
        static void Main(string[] args)
        {
            int i;
            Console.WriteLine("the writepart -1"+543);
            Console.WriteLine("here is your oreder 10/3:"+10.0/3.0);
            Console.WriteLine("the feb {0} or {1}:",28,30);

            Console.WriteLine("Value\tSquared\tCubed");
            for (i = 1; i < 10; i++)
                Console.WriteLine("{0}\t{1}\t{2}", i, i * i, i * i * i);

            Console.WriteLine("Here is 10/3: {0:#.##}", 10.0 / 3.0);
        }
    }
}
