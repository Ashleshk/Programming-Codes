using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

//using Finisar.SQLite;
using System.Data.SQLite;
//animations
using System.Windows.Media.Animation;

namespace SQliteWPF
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        string dbconnectionString = @"Data Source=database.db;version=3;";
        public MainWindow()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
             //open conection to database
            try
            {
                sqliteCon.Open();
                string Query = "select * from employeeinfo where username='"+this.textBox1.Text +"' and password='" +this.passwordBox1.Password +"'";
                SQLiteCommand createCommand = new SQLiteCommand(Query,sqliteCon);
                createCommand.ExecuteNonQuery();
                SQLiteDataReader dr = createCommand.ExecuteReader();

                int count = 0;
                while(dr.Read())
                {
                    count++;
                }
                 if(count==1)
                {
                    MessageBox.Show("username and password is correct");

                     //to open next pge;
                    this.Hide();
                    sqliteCon.Close();
                    Window1 window = new Window1();
                    window.ShowDialog();

                }
                 if (count > 1)
                 {
                     MessageBox.Show(" duplicate username and password  ");
                 }
                 if (count<  1)
                 {
                     MessageBox.Show("username and password is incorrect");
                 }

                 

            }
                
            catch(Exception ex){
                MessageBox.Show(ex.Message);
            }
            
        }

        private void image1_MouseLeave(object sender, MouseEventArgs e)
        {
            Image image1 = (Image)sender;
            DoubleAnimation animation = new DoubleAnimation(0,TimeSpan.FromSeconds(2));
            image1.BeginAnimation(Image.OpacityProperty,animation);
        }

        private void image1_MouseEnter(object sender, MouseEventArgs e)
        {
            Image image1 = (Image)sender;
            DoubleAnimation animation = new DoubleAnimation(1, TimeSpan.FromSeconds(2));
            image1.BeginAnimation(Image.OpacityProperty, animation);
        }

         
    }
}
