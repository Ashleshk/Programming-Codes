using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace labassignment_01
{
    class employee
    {
        public void salry(int x, int y,int p)
        {
            Console.WriteLine("salry of manager");
            Console.WriteLine(x + y+p);
        }
        public void salry(int x )
        {
            Console.WriteLine("salry of pa");
            Console.WriteLine(x );
        }
        public void salry(double x, int y)
        {
            Console.WriteLine("salry of administarator");
            Console.WriteLine(x + y);
        }
        public void salry(double x, double y)
        {
            Console.WriteLine("salry of president");
            Console.WriteLine(x + y);
        }
    }
}
 
 
        
 
