using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Globalization;
using System.Windows.Data;
using System.Windows.Media.Imaging;
using System.IO;

namespace TreeViews_And_VAlue_Converters
{   
    /// <summary>
    /// converts a full path to a specific image type of a drive,folders or files
    /// </summary>
    [ValueConversion(typeof(string),typeof(BitmapImage))]
    public class headerToImageConverter : IValueConverter
    {
        public static headerToImageConverter Instance = new headerToImageConverter();

        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
          //get the full path
            var path = (string)value;

            //if thr path is null , igonore
            if (path == null)
                return null;
            //get the name of the file/folder
            var name = DirectoryStructure.GetFileFolderName(path);
            //by default we presume a image
            var image = "Images/Document-icon.png";
            //if name is blank , we presi=ume its a drive as we cannot have a file or folder
            if (string.IsNullOrEmpty(name))
                image = "Images/drive-icon.png";
            else if (new FileInfo(path).Attributes.HasFlag(FileAttributes.Directory))
                image = "Images/Folder-Close-icon.png";



            return new BitmapImage(new Uri("pack://application:,,,/{image}"));
        }

        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            throw new NotImplementedException();
        }
    }
}
