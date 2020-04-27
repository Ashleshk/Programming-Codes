

using System.ComponentModel;
using System.Threading.Tasks;
namespace TreeViews_And_VAlue_Converters
{
    public class Class1 : INotifyPropertyChanged
    {
        private string mtest;
        public event PropertyChangedEventHandler PropertyChanged = (sender, e) => { };
        public string Test { get; set; }="MY PROPERTY";

        public Class1()
        {
          Task.Run(async()
            {
                int i=0;
                while(true)
                {
                   await Task.Delay(200);
                    Test=(i++).ToString();
                }
            });
        
        }


        public override string ToString()
        {
            return "hello world";
        }
    }
}
