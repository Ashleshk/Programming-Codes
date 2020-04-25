using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace UserDefinedException
{
    class myException:ApplicationException
    {
        public string error;
        public myException(string msg)
        {
            error = msg;
        }
    }
}
