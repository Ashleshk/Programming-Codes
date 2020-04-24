using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace labasssignment
{
    class Program
    {
        static void Main(string[] args)
        { int[,] arr = new int[5,5];
            float[] sum=new float[5];
        Console.WriteLine("enter five subject marks(out of 100):");
        for (int i = 0; i < 5; i++)
        {
            Console.WriteLine(  "student:"+(i+1));
            for (int j = 0; j < 5; j++)
            {
                arr[i, j] = Convert.ToInt32(Console.ReadLine());
                sum[i] = sum[i] + arr[i, j];
            }
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                Console.Write(arr[i, j] + " ");
            }

            Console.WriteLine("percentage is :" + sum[i] / 5+"%");
        }
        }

    }
}
