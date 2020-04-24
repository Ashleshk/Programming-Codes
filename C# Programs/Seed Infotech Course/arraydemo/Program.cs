using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace arraydemo
{
    class Program
    {
        static void Main(string[] args)
        {

            //int[] arr = new int[5];
            //for (int i = 0; i < 5; i++)
            //{
            //    arr[i] = Convert.ToInt32(Console.ReadLine());

            //}
            //for (int i = 0; i < 5; i++)
            //{
            //    Console.Write(arr[i]+" ");

            //}
            //int[,] a = new int[3,4];
            //for (int i = 0; i < 3; i++)
            //{
            //    for (int j = 0; j < 4; j++)
            //    {
            //        a[i, j] = Convert.ToInt32(Console.ReadLine());
            //    }
            //}
            //for (int i = 0; i < 3; i++)
            //{
            //    for (int j = 0; j < 4; j++)
            //    {
            //        Console.Write(a[i,j] + "  ");
            //    } 
            //    Console.ReadLine();
            //}
            int[][] arr=new int[4][];
            arr[0]=new int[3];
            arr[1] = new int[2];
            arr[2] = new int[4];
            arr[3] = new int[1];
            Console.ReadLine();
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
            }
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write(arr[i][j]+ "  ");
                }
                Console.WriteLine();
            }
        }
    }
}
