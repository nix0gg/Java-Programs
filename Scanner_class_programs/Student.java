import java.util.Scanner;
public class Student
{
    String name;
    int age;
    int m1,m2,m3, max;
    double avg;
    public Student()
    {
    }
    
    public Student(String nm, int ag, int mk1, int mk2, int mk3) //Paramaterized Constructor//
    {
        name =nm;
        age = ag;
        m1=mk1;
        m2=mk2;
        m3=mk3;
        max=0;
        avg=0;
    }
    public void Input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name:");
        name=sc.nextLine();
        System.out.print("Enter Age:");
        age=sc.nextInt();
        System.out.print("Enter Marks in subject 1:");
        m1=sc.nextInt();
        System.out.print("Enter Marks in subject 2:");
        m2=sc.nextInt();
        System.out.print("Enter marks in subject 3:");
        m3=sc.nextInt();
        sc.close();
    }
    
    public void Calculate()
    {
        avg=(m1+m2+m3)/3.0;
        max=Math.max(m1,(Math.max(m2,m3)));
    }
    public void Display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks in subject 1:"+m1);
        System.out.println("Marks in subject 2:"+m2);
        System.out.println("Marks in subject 3:"+m3);
        System.out.println("Maximum:"+max);
        System.out.println("Average:"+avg);
    }
     public static void main(String[] args) {
        Student student1 = new Student();
        student1.Input(); // Correct method call
        student1.Calculate();
        System.out.println("Student 1 details *** With default constructor:");
        student1.Display();

        Student student2 = new Student("John Appleseed", 38, 55, 89, 90);
        System.out.println("\nStudent 2 details *** With parameterized constructor:");
        student2.Calculate();
        student2.Display();
    }
   
}