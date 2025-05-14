import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    int travel_allowance;
    int house_rent;
    int salary;

Employee(int emp_id,String emp_name,int travel_allowance,int house_rent,int salary)
{
    this.emp_id=emp_id;
    this.emp_name=emp_name;
    this.travel_allowance=travel_allowance;
    this.house_rent=house_rent;
    this.salary=salary;
}

void total_salary()
{
    int sum=travel_allowance+house_rent+salary;
System.out.printf("Total salary of %s is %d\n", emp_name, sum);
}
    
}

public class Employee_salary
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name=sc.nextLine();
        System.out.println("Enter employee id:");
        int id=sc.nextInt();
        System.out.println("Enter travel allowance:");
        int tra=sc.nextInt();
        System.out.println("Enter house rent allowance:");
        int hra=sc.nextInt();
        System.out.println("Enter basic salary:");
        int salary=sc.nextInt();
        Employee emp=new Employee(id, name, tra, hra, salary);
        emp.total_salary();
    }
}

//pgm 8:Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.


