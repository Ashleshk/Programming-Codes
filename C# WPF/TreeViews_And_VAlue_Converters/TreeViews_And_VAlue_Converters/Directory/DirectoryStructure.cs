

using System.Linq;
using System.IO;
using System.Collections.Generic;
namespace TreeViews_And_VAlue_Converters
{
    public static class DirectoryStructure
    {   
        /// <summary>
        /// gets all hte logical drive on the machine
        /// </summary>
        /// <returns></returns>
        public static List<DirectoryItem> GetLogicalDrives() {
            //get every logical driver on the window
            return Directory.GetLogicalDrives().Select(drive => new DirectoryItem { Fullpath = drive, Type = DirectoryItemType.Drive }).ToList();
        }


        /// <summary>
        /// gets the directories top-level content
        /// </summary>
        /// <param name="fullpath"></param>
        /// <returns></returns>
        public static List<DirectoryItem> GetDirectoryContents(string fullPath)
        {

            //create empty list
            var Items=new List<DirectoryItem>();
           #region get folders
 
            try
            {
                var dirs =Directory.GetDirectories(fullPath);
                if (dirs.Length > 0)
                    Items.AddRange(dirs.Select(dir => new DirectoryItem { Fullpath = dir, Type = DirectoryItemType.Folder }));
            }
            catch {}

 
            #endregion
            #region get files
          //try and get files from the folder ignoring any isssues
      
          try
          {
              var f = Directory.GetFiles(fullPath);
              if (f.Length > 0)
                  Items.AddRange(f.Select(file=>new DirectoryItem{Fullpath=file,Type=DirectoryItemType.File}));
          }
          catch { }



          
            #endregion

         return Items;
        }


        /// <summary>
        /// find the file or folder name from a full path
        /// </summary>
        public static string GetFileFolderName(string path)
        {
            if (string.IsNullOrEmpty(path))
                return string.Empty;
            //make all slashes back slashes
            var normalizedPath = path.Replace('/', '\\');
            //find the last backslash in the path
            var LastIndex = normalizedPath.LastIndexOf('\\');

            //if we don't find a backslah,return the path
            if (LastIndex <= 0)
                return path;

            //return name after the last slash
            return path.Substring(LastIndex + 1);
        }
    }
}
