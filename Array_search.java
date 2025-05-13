import java.util.Scanner;

public class Array_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("enter array elements:");
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int pos=-1;
        System.out.println("enter element to search:");
        int key=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                pos=i+1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("elemnt found at"+pos);
        }
        else {
            System.out.println("element not found");
        }
    }
}

//pgm 6: Program to search for an element in an array.
