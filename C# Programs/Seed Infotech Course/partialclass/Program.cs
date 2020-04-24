using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace partialclass
{
    class Program
    {
        static void Main(string[] args)
        {
            car ob = new car();
            ob.carno = 4123;
            Console.WriteLine("result is"+"  ");
            ob.stop();
        }
    }
}
