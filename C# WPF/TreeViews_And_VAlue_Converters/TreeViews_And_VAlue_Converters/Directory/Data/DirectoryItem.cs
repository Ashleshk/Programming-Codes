 

namespace TreeViews_And_VAlue_Converters 
{  
    /// <summary>
    /// information about the directorry item such as a drive, afile,folder
    /// </summary>
    public class DirectoryItem
    {
        public DirectoryItemType Type { get; set; }
        /// <summary>
        /// the absolute path to this item
        /// </summary>
        public string Fullpath { get; set; }
        /// <summary>
        /// the name of thhis directory 
        /// </summary>
        public string Name { get { return this.Type==DirectoryItemType.Drive?this.Fullpath: DirectoryStructure.GetFileFolderName(this.Fullpath);  } }
    }
}
