using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace customAttributes
{
    [AttributeUsage(AttributeTargets.All,AllowMultiple=true,Inherited=false)]
    class Employee:Attribute
    {
        public int  id;
        public string name, eid;
        public Employee()
        {
            name = "ad";
            eid = "asas";
            id = 1023;
        }
        public Employee(int i,string nm,string id1)
        {
            name = nm;
            eid = id1;
            id = i;
        }
    }
}
