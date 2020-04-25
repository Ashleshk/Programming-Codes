using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace foreachdemo
{
    class Program
    {
        static void Main( )
        {
            int sum = 0;
            int[] nums=new int[10];
            for (int i = 0; i < 10; i++)
                nums[i] = i;

            foreach (int x in nums)
            {
                Console.WriteLine("value is: "+x);
                sum += x;
            }
            Console.WriteLine("summation is :"+sum);
        }
    }
}
