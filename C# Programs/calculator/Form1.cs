using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace calculator
{
    public partial class Form1 : Form
    {
        double result=0;
        String operation_performed = "";
        bool isoperationperformed = false;
        public Form1()
        {
            InitializeComponent();
        }

         

        private void button_Click(object sender, EventArgs e)
        {
            if ((textBox1.Text == "0")||(isoperationperformed))
                textBox1.Clear();
            Button button= (Button)sender;
            if (button.Text == ".")
            { 
              if(textBox1.Text.Contains("."))
                  textBox1.Text = textBox1.Text + button.Text;
            }
            textBox1.Text = textBox1.Text + button.Text;
            isoperationperformed = false;
        }

        private void operator_Click(object sender, EventArgs e)
        {
            Button button = (Button)sender;
            if (result != 0)
            {
                button16.PerformClick();
                operation_performed = button.Text;

                isoperationperformed = true;
                label1.Text = result + " " + operation_performed;
            }
            else
            {
                operation_performed = button.Text;
                result = double.Parse(textBox1.Text);
                isoperationperformed = true;
                label1.Text = result + " " + operation_performed;
            }
        }
        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text = "0";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text = "0";
            result = 0.0;
        }

        private void button16_Click(object sender, EventArgs e)
        {
            switch (operation_performed)
            {
                case "+": textBox1.Text = (result + double.Parse(textBox1.Text)).ToString();
                    break;
                case "-": textBox1.Text = (result - double.Parse(textBox1.Text)).ToString();
                    break;
                case "*": textBox1.Text = (result * double.Parse(textBox1.Text)).ToString();
                    break;
                case "/": textBox1.Text = (result / double.Parse(textBox1.Text)).ToString();
                    break;
                default:
                    break;
            }
            result = double.Parse(textBox1.Text);
            label1.Text = "";
        }
    }
}
