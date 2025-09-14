import java.util.*;
public class Salary
{
    String name, address, subject, special;
        long phone;
        double monthlySalary, incomeTax;

    public void AcceptInput()
    {
        Scanner sc= new Scanner(System.in);
                System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter Address:");
        address =sc.next();
        System.out.print("Enter Phone:");
        phone=sc.nextLong();
        System.out.print("Enter Subject:");
        subject=sc.next();
        System.out.print("Enter specialisation:");
        special=sc.nextLine();
        System.out.print("Enter monthly salary:");
        monthlySalary=sc.nextDouble();
    }
    public void Compute()
    {
        double annualSalary = 12*monthlySalary;
        if(annualSalary>175000)
        incomeTax=annualSalary*0.05;
        else
        incomeTax=0;
        
    }
    public void DisplayData()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phone:"+phone);
        System.out.println("Subject"+subject);
        System.out.println("Specialisation:"+special);
        System.out.println("Monthly Salary:"+monthlySalary);
        System.out.println("Income Tax:"+incomeTax);
        Salary objSalary= new Salary();
        objSalary.AcceptInput();
        objSalary.Compute();
        objSalary.DisplayData();
        
    }
}
