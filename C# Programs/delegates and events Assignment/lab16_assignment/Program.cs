using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab16_assignment
{
    class Program
    {
        static void Main(string[] args)
        {
            int ch;
            accounts acc = new accounts(102015,"ashlesh",5000);
            acc.balancezero += new del1(acc_balancezero);
            acc.cantremove += new del1(acc_cantremove);
            acc.underbalance += new del1(acc_underbalance);
           do{
            Console.WriteLine("do you want to deposit(0) or withdraw(1):");
            ch = Convert.ToInt32(Console.ReadLine());
            if (ch == 0)
                acc.Deposit();
            else
                acc.withdraw();
        }while(ch <2);
           }
        static void acc_underbalance()
        {
            Console.WriteLine("sorry ..... your balnce is below 1000/-");
        }

        static void acc_cantremove()
        {
            Console.WriteLine("ERROR can't withdraw monry.......balnce less than withdraw");
        }

        static void acc_balancezero()
        {
            Console.WriteLine("your balnce is ZEROOOOOO......");
        }
    }
}
