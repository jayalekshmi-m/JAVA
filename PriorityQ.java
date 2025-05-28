import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int num,op;
        while(true){
        System.out.println("1.Add\n 2.Remove\n 3.Display\n 4.Peek\n 5.Poll\n 6.Exit\n Enter your choice:");
        op=sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("enter element to insert:");
                num=sc.nextInt();
                pq.add(num);
                break;
            case 2:
                if(!pq.isEmpty())
                    pq.remove();
                else 
                    System.out.println("Queue is empty");
                break;
            case 3:
                System.out.println("The list is:"+pq);
                break;
            case 4:
                System.out.println("Head is:"+pq.peek());
                break;
            case 5:
                if(!pq.isEmpty())
                {
                    num=pq.poll();
                    System.out.println("Removed head is:"+num);
                }
                else 
                    System.out.println("Queue is empty");
                break;
            case 6:
                System.exit(0);
            

        
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
}

// . Program to demonstrate the creation of queue object using the PriorityQueue class

