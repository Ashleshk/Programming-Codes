using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace ad0_net
{
    public partial class Form1 : Form
    {
        DataSet ds;
        SqlDataAdapter da,da2;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=torana;database=c#19DEC(6-8)ASH;uid=sa;pwd=sa;");
              da = new SqlDataAdapter("select * from dept",con);
              da2 = new SqlDataAdapter("select * from employee",con);
             // da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
              ds = new DataSet();
              da2.Fill(ds,"employee");
            da.Fill(ds,"dept");
            DataRelation dr1 = new DataRelation("emp-dept",ds.Tables["dept"].Columns["deptid"],ds.Tables["employee"].Columns["deptid"]);

            ds.Relations.Add(dr1);
            dataGridView1.DataSource=ds.Tables["dept"];
            dataGridView2.DataSource=ds.Tables["Dept"];
            dataGridView2.DataMember = "emp-dept";
           loaddata();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            DataRow dr = ds.Tables[0].NewRow();
            dr[0] = textBox1.Text;
            dr[1] = textBox2.Text;

            ds.Tables[0].Rows.Add(dr);

           
            MessageBox.Show("update successfull.........");
            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            SqlCommandBuilder cmb = new SqlCommandBuilder(da);
            da.Update(ds.Tables[0]);
            da.UpdateBatchSize=5;

        }

        private void button2_Click(object sender, EventArgs e)
        {
            DataRow dr = ds.Tables[0].Rows.Find(textBox1.Text);
            if (dr == null)
            {
                MessageBox.Show("record not found....");
            }
            else {
                dr[1] = textBox2.Text;
                MessageBox.Show("record updated suuceesfuly....");
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DataRow dr = ds.Tables[0].Rows.Find(textBox1.Text);
            if (dr == null)
            {
                MessageBox.Show("not found");
            }
            else {
                dr.Delete();
                MessageBox.Show("reocrd deleted succesfuly");
            }
        }
        public void loaddata()
        {
            textBox1.DataBindings.Add("text", ds.Tables[1], "deptid");
            textBox2.DataBindings.Add("text", ds.Tables[1], "deptname");
        }

        private void first_Click(object sender, EventArgs e)
        {
            if (BindingContext[ds.Tables[1]].Position == 0)
            {
                MessageBox.Show("already first record");
            }
            else
                BindingContext[ds.Tables[1]].Position = 0;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (BindingContext[ds.Tables[1]].Position == ds.Tables[1].Rows.Count-1)
            {
                MessageBox.Show("already last record");
            }
            else
                BindingContext[ds.Tables[1]].Position = ds.Tables[1].Rows.Count;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (BindingContext[ds.Tables[1]].Position==ds.Tables[1].Rows.Count)
            {
                BindingContext[ds.Tables[1]].Position =0;
            }
            else
                 BindingContext[ds.Tables[1]].Position +=1;
            }

        private void button8_Click(object sender, EventArgs e)
        {
            if (BindingContext[ds.Tables[1]].Position == ds.Tables[1].Rows.Count)
            {
                BindingContext[ds.Tables[1]].Position = 0;
            }
            else
                BindingContext[ds.Tables[1]].Position -= 1;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            ds.WriteXml(@"Z:\ashlesh\book-2\mdiappliactiondemo\ad0_net\Empdata.xml");
            MessageBox.Show(" xml created successfullly.....");
        }

        private void button9_Click(object sender, EventArgs e)
        {
            ds.ReadXml(@"Z:\ashlesh\book-2\mdiappliactiondemo\ad0_net\Empdata.xml");
            dataGridView3.DataSource=ds.Tables["dept"];
        }
        }

       
    }

