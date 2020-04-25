using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace mdiapplcationdemo2
{
    public partial class MDIParent1 : Form
    {
         

        public MDIParent1()
        {
            InitializeComponent();
        }
        private void form1ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 obj = new Form1();
            obj.MdiParent = this;
            obj.Show();
        }

        private void form2ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 obj2 = new Form2();
            obj2.MdiParent = this;
            obj2.Show();
        }
    }
}
