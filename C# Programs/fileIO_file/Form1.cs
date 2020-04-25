using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace fileIO_file
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            File.Create(textBox1.Text);
            MessageBox.Show("file created succesfully");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            File.Copy(textBox1.Text,textBox2.Text);
            MessageBox.Show("file copied succesfully");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            FileInfo obj = new FileInfo(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2");
            listBox1.Items.Add(obj.CreationTime);
            listBox1.Items.Add(obj.Extension);
            listBox1.Items.Add(obj.FullName);
            listBox1.Items.Add(obj.Attributes );
            listBox1.Items.Add(obj.CreationTime);
        }
    }
}
