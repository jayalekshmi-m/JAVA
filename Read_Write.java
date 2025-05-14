
import java.io.*;
import java.util.Scanner;


public class Read_Write {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter filename:");
        String filename=sc.nextLine();
        //writing
        FileOutputStream obj1=new FileOutputStream(filename);
        System.out.println("Enter text to insert:");
        String text=sc.nextLine();
        obj1.write(text.getBytes());
        obj1.close();
        //reading
        FileInputStream obj2=new FileInputStream(filename);
        byte[] b=new byte[obj2.available()];
        obj2.read(b);
        String obj3=new String(b);
        System.out.println("File content is:");
        System.out.println(obj3);
    }
}

//pgm 26:Write a program to write to a file, then read from the file and display the contents on the console.
