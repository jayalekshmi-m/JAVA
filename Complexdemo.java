
import java.util.Scanner;

class Complex{
    int real;
    int img;
    Complex(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
}
public class Complexdemo
{
    public static void main(String[] args) {
        Complex c1=new Complex(0, 0);
        Complex c2=new Complex(0, 0);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real part of first number:");
        int r1=sc.nextInt();
        System.out.println("enter imaginary part of first number:");
        int i1=sc.nextInt();
        System.out.println("enter real part of second number:");
        int r2=sc.nextInt();
        System.out.println("enter imaginary part of second number:");
        int i2=sc.nextInt();
        int res=r1+r2;
        int result=i1+i2;
        System.out.println("sum is:"+res+"+"+result+"i");
    }
}

//exp3: : Read 2 complex numbers and perform addition on the 2 complex numbers.
