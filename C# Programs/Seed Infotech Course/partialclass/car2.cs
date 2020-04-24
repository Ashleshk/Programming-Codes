using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace partialclass
{
    partial class car
    {
        public int modelno;
        public string carcolor;
        public void stop()
        {
            Console.WriteLine(" --=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==--"); add(5,4);
        }

        partial void add(int a,int b);
    }
}
