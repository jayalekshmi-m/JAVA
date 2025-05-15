import java.util.Scanner;

class Shape {
    void area(double r)
    {
        System.out.println("Area of circle is:"+r*r*3.14);
    }

    void area(int l,int b)
    {
        System.out.println("Area of rectangle:"+l*b);
    }
    void area(int s)
    {
        System.out.println("Area of square:"+s*s);
    }
    void area(float b,float h)
    {
        System.out.println("Area of triangle:"+0.5*b*h);
    }
}
public class fun_overload {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle:");
        double r=sc.nextInt();
        System.out.println("Enter length and breadth of rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter side of square:");
        int s=sc.nextInt();
        System.out.println("enter base and height of triangle:");
        float base=sc.nextInt();
        float h=sc.nextInt();
        Shape obj=new Shape();
        obj.area(r);
        obj.area(l, b);
        obj.area(s);
        obj.area(base, h);
        
        
    }
}
