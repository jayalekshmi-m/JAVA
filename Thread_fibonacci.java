class Fibo extends Thread{
    int limit;
    Fibo(int limit)
    {
        this.limit=limit;
    }
    public void run()
    {
        int a=0,b=1,c;
        System.out.println("fibonacci series upto "+limit+"terms:");
        if(limit >= 1)
            System.out.println(a);
        if(limit >= 2)
            System.out.println(b);
        for(int i=2;i<=limit;i++)
        {
            c=a+b;
            System.out.println(c +" ");
            a=b;
            b=c;
        }
    }
}

public class Thread_fibonacci {

    public static void main(String[] args) {
        int limit=5;
        Fibo fibo=new Fibo(limit);
        fibo.start();
    }
}

// fibonacci series using thread class