import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
    
}

class Circle implements Shape{
    int r;
    Circle(int r)
    {
        this.r=r;
    }

    public void area()
    {
        System.out.println("Area is:"+3.14*r*r);
    }
    public void perimeter()
    {
        System.out.println("Circumference is:"+2*3.14*r);
    }
}
class Rectangle implements Shape 
{
    int l;
    int b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }

    public void area()
    {
        System.out.println("Area is:"+l*b);
    }
    public void perimeter()
    {
        System.out.println("Perimeter is :"+2*(l+b));
    }
}


public class Interface 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option; 
        //implementing polymorphism
        Shape obj=null;
        while(true)
        {
        System.out.println("Enter which object to create: 1.Circle 2.Rectangle 3.Exit ");
        option=sc.nextInt();

        if(option==1)
        {
            System.out.println("Enter radius:");
            int r=sc.nextInt();
            obj=new Circle(r);
        }
        else if(option==2)
        {
            System.out.println("Enter length and breadth:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            obj=new Rectangle(l, b);
        }
        else if(option==3)
        {
            break;
        }
        else 
        {
            System.out.println("Invalid option");
            continue;
        }
        

        System.out.println("Enter what to find: 1.Area 2.Perimeter 3.Exit");
        option=sc.nextInt();
        if(option==1)
        {
            obj.area();
        }
        else if(option==2)
        {
            obj.perimeter();
        }
        else if(option==3)
        {
            break;
        }
        else 
        {
            System.out.println("Invalid choice");
            continue;
        }
    }

    }
}

//pgm 13:Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects. 

