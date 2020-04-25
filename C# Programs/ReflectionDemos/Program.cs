using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Reflection;

namespace ReflectionDemos
{
    class Program
    {
        static void Main( )
        {
            Assembly asm = Assembly.LoadFile(@"C:\Users\c#dec19_14\Desktop\Calculatordll\Calculatordll\bin\Debug\Calculatordll.dll");
             Type[] tp= asm.GetTypes();
             foreach (Type t in tp)
             {
                 Console.WriteLine("  \n\n" + t.Name + "  \n\n");
                 FieldInfo[] fi=t.GetFields();
                 foreach(FieldInfo i in fi)
                     Console.WriteLine(i.Name);
                 
                 MethodInfo[] info=t.GetMethods(BindingFlags.DeclaredOnly |BindingFlags.Instance |BindingFlags.Public);
                  foreach (MethodInfo mi in info)
                 {
                     Console.WriteLine("\n"+mi.Name+"\n");
                     ParameterInfo[] pinfo=mi.GetParameters();
                     foreach (ParameterInfo pin in pinfo)
                     {
                         Console.WriteLine(pin.Name+"\t"+"\t"+pin.ParameterType);
                     }
                 }
                  Console.Read();
               //  MethodInfo abc=t.GetMethod("Add");
                // Object obj=asm.CreateInstance(t.FullName);
                 //abc.Invoke(obj, new object[] { 33, 33 });
             }
        }
    }
}
