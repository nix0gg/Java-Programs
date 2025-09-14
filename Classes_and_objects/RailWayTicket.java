import java.util.Scanner;
public class RailWayTicket
{
    String name, coach;
    long phone;
    int amt;
    int totalamt;
    
    public void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter Type of Coach:");
        coach=sc.nextLine();
        System.out.print("Enter phone:");
        phone=sc.nextLong();
        System.out.print("Enter amount:");
        amt=sc.nextInt();
        sc.close();
    }
    public void update()
    {
        if(coach=="first_AC")
        totalamt=amt+700;
        else if(coach=="second_AC")
        totalamt=amt+500;
        else if(coach=="third_AC")
        totalamt=amt+250;
        else if(coach=="sleeper");
        totalamt=amt;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Coach type:"+coach);
        System.out.println("Phone:"+phone);
        System.out.println("Amount:"+amt);
        System.out.println("Total amount:"+totalamt);
    }
        public static void main(String[] args)
        {
            RailWayTicket objTicket = new RailWayTicket();
            objTicket.accept();
            objTicket.update();
            objTicket.display();
        }
    }
        
        
        
    