using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace tostringdemo
{
    class Program
    {
        static void Main(string[] args)
        {
            classs aob = new  classs();
            aob.display();
            classs a = new classs("sham", 3253);
            a.display();
            a.ToString();

        }
    }
}
