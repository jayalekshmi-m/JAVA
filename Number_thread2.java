class NumberPrinter implements Runnable{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class Number_thread2 {

    public static void main(String[] args) {
        NumberPrinter printer=new NumberPrinter();
        Thread thread=new Thread(printer);
        thread.start();
    }
}