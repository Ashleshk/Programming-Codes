﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace project_1
{
    class Program
    {
        static void Main(string[] args)
        {
            bool b;
            b = false;
            Console.WriteLine("b is " + b);
            b = true;
            Console.WriteLine("b is " + b);
            // A bool value can control the if statement.
            if (b) Console.WriteLine("This is executed.");
            b = false;
            if (b) Console.WriteLine("This is not executed.");
            // Outcome of a relational operator is a bool value.
            Console.WriteLine("10 > 9 is " + (10 > 9));
        }
    }
}
