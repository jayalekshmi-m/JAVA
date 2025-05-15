import java.util.Scanner;

public class sort_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[5];
        for(int i=0;i<str.length;i++)
        {
        System.out.println("enter string:");
        str[i]=sc.next();
        }
        //sort
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
{
                if(str[i].compareTo(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
}

        }
        System.out.println("Strings after sorting:");
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
}
