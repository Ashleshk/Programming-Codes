using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace polymorphism
{
    class Program
    {
        static void Main(string[] args)
        {

            circle ob = new circle();
            ob.draw();
            Console.WriteLine(ob.ToString() );          
                
        }
    }
    class shape
    {
        public virtual  void draw()
        {
            Console.WriteLine("draw method of the shape.....");
        }
        public override string ToString()
        {
            return "you are in shape...,,,,,l.,.";
        }
        
    }
    class circle : shape 
    {
        public override void draw()
        { Console.WriteLine("draw method of circle class.........."); 
        }

        public override string ToString()
        {
            return "dhaamaaaal";
        } 
    }
}
