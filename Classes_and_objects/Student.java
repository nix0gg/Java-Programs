import java.util.Scanner;
public class Student
{
    String name;
    int age;
    int m1,m2,m3,max;
    double avg;
    
    public Student()
    {
    }
    public Student(String nm, int ag, int mk1, int mk2, int mk3)
    {
        name=nm;
        age=ag;
        m1=mk1;
        m2=mk2;
        m3=mk3;
        max=0;
        avg=0;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        name=sc.nextLine();
        System.out.print("Enter age:");
        age=sc.nextInt();
        System.out.print("Enter marks in subject1:");
        m1=sc.nextInt();
        System.out.print("Enter marks in subject2:");
        m2=sc.nextInt();
        System.out.print("Enter marks in subject3:");
        m3=sc.nextInt();
        sc.close();
    }
    public void Compute()
    {
        avg=(m1+m2+m3)/3.0;
        max=Math.max(m1,(Math.max(m2,m3)));
    }
    public void Display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks in subject1:"+m1);
        System.out.println("Marks in subject2:"+m2);
        System.out.println("Marks in subject3:"+m3);
        System.out.println("Maximum:"+max);
        System.out.println("Average:"+avg);
    }
    public static void main(String args[])
    {
        Student student1=new Student();
        student1.Input();
        student1.Compute();
        student1.Display();
        
        
    }
}


    
