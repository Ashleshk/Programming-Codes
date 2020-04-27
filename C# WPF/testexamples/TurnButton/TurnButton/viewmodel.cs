using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TurnButton
{
    class VM : INotifyPropertyChanged
    {
        private int angleValue;
        public int AngleValue
        {
            get
            {
                return this.angleValue;
            }
            set
            {
                this.angleValue = value;
                RaisePropertyChanged("AngleValue");
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;
        void RaisePropertyChanged(string propertyName)
        {
            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
            }
        }

    }
}
