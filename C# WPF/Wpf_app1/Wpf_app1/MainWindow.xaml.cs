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
 
namespace Wpf_app1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    { 
        public MainWindow()
        {
            InitializeComponent();
        }


        private void ApplyButton_Click(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("the Desciprtion is :" + this.DescriptionText.Text); setitup( );
        }

        private void ResetButton_Click(object sender, RoutedEventArgs e)
        {
            this.WeldCheckBox.IsChecked = this.assemblyCheckBox.IsChecked = this.PlasmaCheckBox.IsChecked = this.LaserCheckBox.IsChecked = this.PurchaseCheckBox.IsChecked =
                this.LatheCheckBox.IsChecked = this.DrillCheckBox.IsChecked = this.FoldCheckBox.IsChecked = this.RollCheckBox.IsChecked = this.SawCheckBox.IsChecked = false;
            this.Notetext.Text = this.LengthText.Text = this.Masstext.Text=this.statusbox.Text=this.revisionBox.Text=this.partnumberbox.Text=this.DescriptionText.Text=this.SupplierCodetext.Text=this.SupplierNameText.Text="";
            this.materialDropdown.SelectedIndex=0;

        }

        private void CheckBox_Checked(object sender, RoutedEventArgs e)
        {
            this.LengthText.Text += ((CheckBox)sender).Content+" ";
        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void FinishDropdown_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (this.Notetext == null)
                return;
            var combo = (ComboBox)sender;
            //MessageBox.Show("the value "+g);
            var value = (ComboBoxItem)combo.SelectedValue;
            if ((combo.Name.CompareTo("materialDropdown")) == -1)
                this.Notetext.Text = (string)value.Content + " ";
            else
            {
                var s = this.Notetext.Text;
                string[] words = s.Split(' ');
                if (words[0].CompareTo("Rubber") == 1)
                {
                    words[0] = (string)value.Content;
                    this.Notetext.Text = words[0] + words[1];
                    //this.Notetext.Text = (string)value.Content + " ";
                }
                if (words[1].CompareTo("Rubber") == 1)
                {
                    words[1] = (string)value.Content;
                    this.Notetext.Text = words[0] + words[1];
                    //this.Notetext.Text = (string)value.Content + " ";
                }
                if(true){
                    this.Notetext.Text += (string)value.Content + " ";
                }
            }
        }
        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            FinishDropdown_SelectionChanged(this.FinishDropdown,null);
        }

        private void Notetext_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void SupplierNameText_TextChanged(object sender, TextChangedEventArgs e)
        {
             
        }

        private void DescriptionText_TextChanged(object sender, TextChangedEventArgs e)
        {
            

        }
        void setitup()
        {
            var s = this.DescriptionText.Text;
            string[] words = s.Split(' ');
            //for (int i = 0; i < words.Length;i++ )
            //{ MessageBox.Show(" "+words[i]); }
            this.statusbox.Text = words[0];
            this.revisionBox.Text = words[1];
            for (int i = 2; i < words.Length; i++)
            { this.partnumberbox.Text += words[i] + " "; }
        }

        private void Dropdown_Select(object sender, SelectionChangedEventArgs e)
        {
            if (this.Masstext == null)
                return;
            this.Masstext.Text = (string)((ComboBoxItem)((ComboBox)sender).SelectedValue).Content +" -100kg";
        }
 

        
         
    }
}
