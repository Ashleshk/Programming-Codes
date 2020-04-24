using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab16_assignment
{  
     public delegate void del1();
    class accounts
    {
        public event del1 underbalance;
        public event del1 balancezero;
        public event del1 cantremove;

        public int acc_num;
        public string acc_name;
        public int bal;
        public accounts(int num,string name,int b)
        {
          acc_num=num;
          acc_name=name;
         bal=b;
         }
        public void withdraw()
        {
            Console.WriteLine("enter amount to withdraw:");
            int wid = Convert.ToInt32(Console.ReadLine());
            if (wid > bal)
            {
                cantremove();
            }
            else if (wid == bal)
            {
                balancezero();
            }
            else if (bal <= 1000)
            {
                underbalance();
            }
            else
                bal = bal - wid;
        }
        public void Deposit()
        {
            Console.WriteLine("enter money to deposit:");
            int deposit = Convert.ToInt32(Console.ReadLine());
            bal = bal + deposit;
        }

    }
}
