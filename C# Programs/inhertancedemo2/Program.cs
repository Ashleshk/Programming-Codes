using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace inhertancedemo2
{
    class Program
    {
        static void Main( )
        {
            Manager ob = new Manager(543,"33",43,43,43);
            ob.display();
            ob.calc();
            ob.display();
            Console.ReadLine();
        }
    }
}
