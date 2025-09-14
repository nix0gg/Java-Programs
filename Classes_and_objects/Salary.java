import java.util.Scanner;

class Salary
{
    String name, address,subject, special;
    long phone;
    double monthlySalary, incomeTax;
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name:");
        name=sc.nextLine();
        System.out.print("Enter address:");
        address=sc.nextLine();
        System.out.print("Enter phone:");
        phone=sc.nextLong();
        System.out.print("Enter subject:");
        subject=sc.next();
        System.out.print("Enter specialisation:");
        special=sc.next();
        System.out.print("Enter monthly salary:");
        monthlySalary=sc.nextInt();
        sc.close();
        
    }
    public void Compute()
    {
        double annualSalary = 12*monthlySalary;
        if(annualSalary>175000)
        incomeTax=annualSalary*0.05;
        else
        incomeTax =0;
    }
    public void Display()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phone:"+phone);
        System.out.println("Subject:"+subject);
        System.out.println("Specialisation:"+special);
        System.out.println("Monthly Salary:"+monthlySalary);
        System.out.println("Income Tax: Rs"+incomeTax);
        
    }
    public static void main(String args[])
    {
        Salary salary1 = new Salary();
        salary1.Input();
        salary1.Compute();
        salary1.Display();
    }
    }

