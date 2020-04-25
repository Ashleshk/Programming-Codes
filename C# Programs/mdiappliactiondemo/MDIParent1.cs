using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace mdiappliactiondemo
{
    public partial class MDIParent1 : Form
    {
         
        public MDIParent1()
        {
            InitializeComponent();
        }
         

        private void CascadeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.Cascade);
        }

        private void TileVerticalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileVertical);
        }

        private void TileHorizontalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileHorizontal);
        }

        private void ArrangeIconsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.ArrangeIcons);
        }

        private void CloseAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (Form childForm in MdiChildren)
            {
                childForm.Close();
            }
        }
        Form2 obj2 = new Form2(); Form1 obj = new Form1();
        private void form1ToolStripMenuItem_Click(object sender, EventArgs e)
        {

            obj.MdiParent = this; obj2.Hide();
            obj.StartPosition = 0;
            obj.Show();
        }

        private void form2ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
            obj2.MdiParent = this;
            obj2.StartPosition = 0; obj.Hide();
            obj2.Show();
        }

        private void MDIParent1_Load(object sender, EventArgs e)
        {

        }
    }
}
