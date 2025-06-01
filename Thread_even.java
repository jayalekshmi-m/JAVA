import java.util.Scanner;

class Fibo implements Runnable{
     int limit;
    Fibo(int limit)
    {
        this.limit=limit;
    }
    public void run()
    {
        int a=0;
        int b=1;
        int c;
        if(limit >= 1)
             System.out.println(a);
        if(limit >= 2)
             System.out.println(b);
        for(int i=2;i<=limit;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

class Even implements Runnable{
    int start;
    int end;
    Even(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}

public class Thread_even {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit of fibo series ");
        int limit = sc.nextInt();

         System.out.print("Enter start range of even: ");
        int start = sc.nextInt();

         System.out.print("Enter end range of even: ");
        int end = sc.nextInt();

        Fibo fibo=new Fibo(limit);
        Even even =new Even(start, end);

        Thread thread1=new Thread(fibo);
        Thread thread2=new Thread(even);

        thread1.start();
        thread2.start();

    }
}

// Define 2 classes; one for generating Fibonacci numbers and other for displaying even
// numbers in a given range. Implement using threads. (Runnable Interface) 