class Palindrome extends Thread{
    int start;
    int end;
    Palindrome(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        System.out.println("Palindrome checking from "+start+"and"+end);
        int rev=0;
        for(int i=start;i<=end;i++)
        {
            if(isPalindrome(i))
                System.out.println(i);
        }

    }

    boolean isPalindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev= rev*10+r;
            n=n/10;
        }
        if(rev==temp)
            return true;
        else 
            return false;
    }

}

public class Thread_palindrome {

    public static void main(String[] args) {
        int start=100;
        int end=200;
        Palindrome pal=new Palindrome(start, end);
        pal.start();
    }
}

// Palindrome checking in a specific range