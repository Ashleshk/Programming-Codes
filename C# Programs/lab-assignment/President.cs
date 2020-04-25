using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Polymorphism2
{
    class President:Employee
    {
        int km, tourAllowance, telephone;
        public President()
        {
            km = 0;
            tourAllowance = 0;
            telephone = 0;
        }
        public President(int a, int b, int c, string name, int id, int sal): base(name, id, sal)
        {
            km = a;
            tourAllowance = b;
            telephone = c;
        }
        public override string ToString()
        {
            return "Salary of president is "+(base.basicSalary+(km*8)+telephone);
        }
    }
}
