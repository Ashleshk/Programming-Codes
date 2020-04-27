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
using System.Windows.Shapes;

using System.Data.SQLite;
using System.Data;
namespace SQliteWPF
{
    /// <summary>
    /// Interaction logic for Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        string dbconnectionString = @"Data Source=database.db;version=3;";
        
        void fill_ComboBox()
        {

            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();
                comboBox1.Items.Add("select name");
                string Query = "select * from employeeinfo";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
               // createCommand.ExecuteNonQuery();
                SQLiteDataReader dr = createCommand.ExecuteReader();
                while (dr.Read())
                {
                    string name = dr.GetString(1);
                    comboBox1.Items.Add(name);
                }
                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        void fill_ListBox()
        {

            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();
                 
                string Query = "select * from employeeinfo";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                // createCommand.ExecuteNonQuery();
                SQLiteDataReader dr = createCommand.ExecuteReader();
                while (dr.Read())
                {
                    string name = dr.GetString(1);
                    string surname = dr.GetString(2);
                    int age = dr.GetInt32(3);
                    
                    listBox1.Items.Add(name+"  "+surname+"  "+age);
                }
                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        public Window1()
        {
            InitializeComponent();
            fill_ComboBox();
            fill_ListBox();
        }

        private void Save_Click(object sender, RoutedEventArgs e)
        {
            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();
                string Query = "insert into employeeinfo (eid,name,surname,age) values('" + this.textEid.Text+ "','" + this.textName.Text + "','" + this.textSurname.Text + "','" + this.textAge.Text + "')";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                createCommand.ExecuteNonQuery();
                MessageBox.Show("Data Saved");
                sqliteCon.Close();
                 




            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void Update_Click(object sender, RoutedEventArgs e)
        {

            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();
                string Query = "update employeeinfo set eid='" + this.textEid.Text + "',name='" + this.textName.Text + "',surname='" + this.textSurname.Text + "',age='" + this.textAge.Text +"' where eid='"+this.textEid.Text+"' ";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                createCommand.ExecuteNonQuery();
                MessageBox.Show("Data upDATED");
                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void Delete_Click(object sender, RoutedEventArgs e)
        {

            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();
                string Query = "delete from employeeinfo where eid='"+this.textEid.Text+"'";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                createCommand.ExecuteNonQuery();
                MessageBox.Show("Data Deleted");
                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        

        private void comboBox1_DropDownClosed(object sender, EventArgs e)
        {
            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();

                string Query = "select * from employeeinfo where name='" + comboBox1.SelectedItem + "'";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                // createCommand.ExecuteNonQuery();
                SQLiteDataReader dr = createCommand.ExecuteReader();
                while (dr.Read())
                {
                    string seid = dr.GetInt32(0).ToString();
                    string sname = dr.GetString(1);
                    string ssurname = dr.GetString(2);
                    string sage = dr.GetInt32(3).ToString();

                    textEid.Text = seid;
                    textName.Text = sname;
                    textSurname.Text = ssurname;
                    textAge.Text = sage;
                }

                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            SQLiteConnection sqliteCon = new SQLiteConnection(dbconnectionString);
            //open conection to database
            try
            {
                sqliteCon.Open();

                string Query = "select eid,name,surname,age from employeeinfo  ";
                SQLiteCommand createCommand = new SQLiteCommand(Query, sqliteCon);
                createCommand.ExecuteNonQuery();
                SQLiteDataAdapter dataadp = new SQLiteDataAdapter(createCommand);
                DataTable dt = new DataTable("employeeinfo");
                dataadp.Fill(dt);
                dataGrid1.ItemsSource = dt.DefaultView;
                dataadp.Update(dt);
                sqliteCon.Close();

            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

         
    }
}
