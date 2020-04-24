using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AttributesDemos
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            p.old_method();

        }
        [Obsolete("use new instead of old one")]
        public void old_method()
        {

            Console.WriteLine("Hello world from old");
        }
        public void New_method()
        {

            Console.WriteLine("Hello world from new");
        }
    }
}
