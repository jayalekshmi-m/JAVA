import java.util.Scanner;

class NeagativeException extends RuntimeException{
    NeagativeException(String message)
    {
        super(message);
    }
}

public class Neg_Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number count:");
        int sum=0;
        int num;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number:");
             num=sc.nextInt();
        
        try{
            if(num<0)
            {
                throw new NeagativeException("Only positive numbers!!");
            }
            else 
            {
                sum=sum+num;
            }
        }
        catch(NeagativeException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
        System.out.println("Average is : "+sum/n);
    }
}

//pgm 16: : Find the average of N positive integers, raising a user defined exception for each negative input
