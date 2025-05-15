import java.util.Scanner;

class Employee{
    int emp_id;
    String name;
    String address;

    Employee(int emp_id,String name,String address)
    {
        this.emp_id=emp_id;
        this.name=name;
        this.address=address;
    }

    void display()
    {
        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee address:"+address);
    }
}

class Teacher extends Employee{
    String dept;
    String sub;

    Teacher(int emp_id,String name,String address,String dept,String sub)
    {
        super(emp_id, name, address);
        this.dept=dept;
        this.sub=sub;
    }

    void display()
    {
        super.display();
        System.out.println("Department:"+dept);
        System.out.println("Subject:"+sub);
    }
}

public class Single_Inheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of teachers:");
        int n=sc.nextInt();
        Teacher[] obj=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details for teacher "+(i+1));

            System.out.println("Enter id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name:");
            String name=sc.nextLine();
            System.out.println("Enter address:");
            String address=sc.nextLine();
            System.out.println("Enter department:");
            String dept=sc.nextLine();
            System.out.println("Enter subject:");
            String sub=sc.nextLine();

            obj[i]=new Teacher(id,name,address,dept,sub);
        }

        for(int i=0;i<n;i++)
        {
            obj[i].display();
            System.out.println();
        }
    }
}

// pgm 11:Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the properties of classemployee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data members.Use array of objects to display details of N teachers. 



