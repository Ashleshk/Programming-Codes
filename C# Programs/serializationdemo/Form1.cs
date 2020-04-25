using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Runtime.Serialization.Formatters.Binary;
using System.IO;

namespace serializationdemo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            student obj = new student();
            obj.stdid = Convert.ToInt32(textBox1.Text);
            obj.stdname = textBox2.Text;
            obj.marks = Convert.ToInt32(textBox3.Text);

            BinaryFormatter bf = new BinaryFormatter();
            FileStream fs = new FileStream(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2\student.txt",FileMode.Append,FileAccess.Write);
            bf.Serialize(fs, obj);
            fs.Close();
            MessageBox.Show("serialization successfull......");


        }

        private void button2_Click(object sender, EventArgs e)
        {
            FileStream fs = new FileStream(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2\student.txt",FileMode.Open,FileAccess.Read);
            BinaryFormatter bf = new BinaryFormatter();
            student s=(student) bf.Deserialize(fs);
            listBox1.Items.Add(s.stdid);
            listBox1.Items.Add(s.stdname);
            listBox1.Items.Add(s.marks );
            fs.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();

            /*setting focus on first textbox*/
            textBox1.Focus();
        }

       

         

         
    }
}
