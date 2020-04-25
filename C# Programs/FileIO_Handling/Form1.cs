using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace FileIO_Handling
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Directory.CreateDirectory(textBox1.Text);
            MessageBox.Show("directory created successful...");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Directory.Move(textBox1.Text,textBox2.Text);
            MessageBox.Show("directory moved successfully...");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Directory.Delete(textBox3.Text,true);
            MessageBox.Show("directory deleted successfully...");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            DirectoryInfo obj = new DirectoryInfo(@"Z:\ashlesh\book-2\mdiappliactiondemo\directory2");
            DirectoryInfo[]arr= obj.GetDirectories();

            foreach(var item in arr)
            {
                listBox1.Items.Add(item);
            }

            //for getting files from dirextories
            FileInfo[] aar1 = obj.GetFiles();
            listBox1.Items.Add(obj.CreationTime);
            listBox1.Items.Add(obj.Extension);
            listBox1.Items.Add(obj.FullName);
            listBox1.Items.Add(obj.Attributes );
            listBox1.Items.Add(obj.CreationTime);
        }
    }
}
