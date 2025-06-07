import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleEvenOdd {

    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);

        System.out.println("enter input filename:");
        String inputFile=sc.nextLine();
        Scanner input=new Scanner(new File(inputFile));

        PrintWriter evenOut=new PrintWriter("even.txt");
        PrintWriter oddOut=new PrintWriter("odd.txt");

        while(input.hasNextInt())
        {
            int num=input.nextInt();
            if(num%2==0)
                evenOut.println(num);
            else 
                oddOut.println(num);
        }
        input.close();
        oddOut.close();
        evenOut.close();
        sc.close();

        System.out.println("even numbers saved to even.txt");
        System.out.println("odd numbers saved to odd.txt");
    }
}

// write a pgm that reads from a file having integers.copy even numbers and odd numbers to separate files 