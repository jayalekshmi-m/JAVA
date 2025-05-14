import java.util.Scanner;


class String_manipulation {
    String str;
    String_manipulation(String str)
    {
        this.str=str;
    }

    void upper()
{
    System.out.println("Uppercase is:"+str.toUpperCase());
}

void lower()
{
    System.out.println("Lower case is:"+str.toLowerCase());
}

void length()
{
    System.out.println("Length of string is:"+str.length());
}

void substring()
{
    for(int i=0;i<str.length();i++)
    {
        System.out.println(str.substring(i));
    }
}

void first_occurence(char c)
{
    System.out.println("First occurence of"+c+" is at"+str.indexOf(c));
}
}


public class String_operation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        String_manipulation s1=new String_manipulation(str);
        s1.upper();
        s1.lower();
        s1.length();
        s1.substring();
        System.out.println("Enter the character to find first occurence:");
        char c=sc.next().charAt(0);
        s1.first_occurence (c);
    }
}

//pgm 7:: Java program to demonstrate string manipulation functions.
