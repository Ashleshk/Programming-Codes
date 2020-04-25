using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace ado_netdemo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            LOAD();
        }
        public void LOAD()
        {
            /*   connection string*/
            SqlConnection con = new SqlConnection("server=TORANA;database=c#19DEC(6-8)ASH;uid=sa;pwd=sa");


            // wirte a query
            string str = "select * from employee ";

            //connect sql to conncetion

            SqlCommand cmd = new SqlCommand(str, con);

            //open the connection
            con.Open();

            //fire query
            SqlDataReader dr = cmd.ExecuteReader();
            DataTable dt = new DataTable();
            dt.Load(dr);
            dataGridView1.DataSource = dt;


            //close the connection

            con.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=TORANA;database=c#19DEC(6-8)ASH;uid=sa;pwd=sa");
            string str = "insert into employee values(" + textBox1.Text + ",'" + textBox2.Text + "'," + textBox3.Text + "," + textBox4.Text + ")";
            SqlCommand cmd = new SqlCommand(str,con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("insert successfull........");
            LOAD();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            textBox4.Clear();
            textBox1.Focus();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=TORANA;database=c#19DEC(6-8)ASH;uid=sa;pwd=sa");
            string str = " update employee set ename='"+textBox2.Text+"',salary="+textBox3.Text+",age="+textBox4.Text+ "where emp_id ="+textBox1.Text ;
            SqlCommand cmd = new SqlCommand(str, con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("update successfull........");
            LOAD();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=TORANA;database=c#19DEC(6-8)ASH;uid=sa;pwd=sa");
            string str = "delete from employee where emp_id=" + textBox5.Text; 
            SqlCommand cmd = new SqlCommand(str, con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            MessageBox.Show("the entry at empid"+textBox5.Text+ "was successfully deleted");
            textBox5.Clear();
            LOAD();
        }

        
    }
}
