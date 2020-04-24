using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace multicast
{
    class Program
    {
        public delegate void del1(int a, int b);
        static void Main(string[] args)
        {
            del1 obj = new del1(imath.add);
            obj += new del1(imath.sub);
            obj += new del1(imath.mul);
            obj += new del1(imath.div);

            obj.Invoke(20,30);
            Console.WriteLine("*****************************");
            obj -= new del1(imath.sub);
            obj.Invoke(20, 30);
        }
    }
}
