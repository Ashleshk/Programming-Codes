using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace UserDefinedGenericClass
{
    class myStack<T>
    {
        T[] arr;
        int top;
        public myStack(int size)
        {
            arr = new T[size];
            top = -1;
        }
        public void push( T param)
        {
            arr[++top] = param;
        }
        public void pop()
        {
            Console.WriteLine(arr[top--]);
        }
    }
}
