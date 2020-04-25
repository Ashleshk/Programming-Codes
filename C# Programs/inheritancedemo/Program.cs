using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace inheritancedemo
{
    class Program
    {
        static void Main( )
        {
            Manager ob = new Manager(25,433);
            ob.display();
            ob.calc();
            ob.display();
            Console.ReadLine();
        }
    }
}
