using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace filestreamdemo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FileStream obj = new FileStream(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2\employeedetail.txt",FileMode.Create,FileAccess.Write);
            StreamWriter sw = new StreamWriter(obj);
            sw.WriteLine(textBox1.Text);
            sw.WriteLine(textBox2.Text);
            sw.WriteLine(textBox3.Text);
            sw.Close();
            obj.Close();
            MessageBox.Show("data saved successfully.....");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            FileStream fs = new FileStream(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2\employeedetail.txt", FileMode.Open, FileAccess.Read);
            StreamReader sr = new StreamReader(fs);
            listBox1.Items.Add(sr.ReadToEnd());
        }

        

         
    }
}
