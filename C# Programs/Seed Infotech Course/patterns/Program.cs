using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace patterns
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] a = new int[5, 5];
           
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if(i<j)
                       Console.Write("*" + "  ");
                }
                Console.WriteLine();
            }

            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if (i > j)
                        Console.Write("*" + "  ");
                }
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5-i; j++)
                { 
                      if(j>=i)  
                    Console.Write("*" + "  ");
                }
                 
            }
            Console.WriteLine();
            
        }
    }
}
