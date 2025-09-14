import java.util.Scanner;
public class ShowRoom
{
    String name;
    long phone;
    double cost;
    double dis;
    double amount;

    public void Input()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name:");
    name=sc.nextLine();
    System.out.print("Enter mobile number:");
    phone=sc.nextLong();
    System.out.print("Enter cost:");
    cost=sc.nextDouble();
    
}
public void calculate()
{
    if(cost <=10000)
    dis=5.0;
    else if(cost<=20000)
    dis=10.0;
    else if(cost<=35000)
    dis=15.0;
    else
    dis=20.0;
    dis = dis/100.0*cost;
    amount = cost-dis;
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("Phone:"+phone);
System.out.println("Amount to be paid:"+amount);
}
public static void main(String args[])
{
    ShowRoom obj= new ShowRoom();
    obj.Input();
    obj.calculate();
    obj.display();
}
}
