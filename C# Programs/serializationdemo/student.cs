using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace serializationdemo
{   [Serializable]
    class student
    {
    public int stdid;
    public string stdname;
    [NonSerialized]
    public float marks;
    }
}
