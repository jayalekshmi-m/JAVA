import java.util.Scanner;

class Product {
    String pname;
    int pcode;
    int price;

    Product(String x,int y,int z){
    pname=x;
    pcode=y;
    price=z;
}
}
public class Productdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product obj[]=new Product[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter product name:");
            String name=sc.next();
            System.out.println("Enter product code:");
            int code=sc.nextInt();
            System.out.println("Enter product price:");
            int price=sc.nextInt();
            obj[i]=new Product(name,code,price);
        }
        int min=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<3;i++)
        {
            if(obj[i].price < min){
                min = obj[i].price;
                pos=i;
            }
        }
        System.out.println("Product with min price:");
        System.out.println(obj[pos].pname);
        System.out.println(obj[pos].pcode);
        System.out.println(obj[pos].price);
    }
}

//Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.



