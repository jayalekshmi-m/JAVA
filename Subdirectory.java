import java.io.File;
import java.util.Scanner;
public class Subdirectory {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter directory path:");
        String path=sc.nextLine();
        File directory=new File(path);

        if(!directory.exists() ||  !directory.isDirectory())
        {
            System.out.println("invalid directory path");
            return;
        }

        System.out.println("listing all files and sub directories in:"+path);
        listFilesAndDirs(directory);

        System.out.println("enter the name of file to search:");
        String filename=sc.nextLine();

        boolean found=searchFile(directory,filename);
        if(!found)
        {
            System.out.println("file not found");
        }
    }

        public static void listFilesAndDirs(File dir)
        {
            File[] files=dir.listFiles();
            if(files==null)
                return;

            for (int i = 0; i < files.length; i++) {
                File file = files[i];

                if(file.isDirectory())
                {
                    System.out.println("[DIR]"+file.getAbsolutePath());
                    listFilesAndDirs(file);
                } else 
                {
                    System.out.println("[FILE]"+file.getAbsolutePath());
                }
            }
        }

        public static boolean searchFile(File dir,String filename)
        {
            File[] files=dir.listFiles();
            if(files==null)
                return false;

            for(File file:files)
            {
                if(file.isDirectory())
                {
                    if(searchFile(file,filename))
                    {
                        return true;
                    }
                } else if (file.getName().equalsIgnoreCase(filename)){
                    System.out.println("file found:"+file.getAbsolutePath());
                    return true;
                }
            }
                return false;

                
            }
        }
    
// pgm to list the sub directories and also search for a file name.