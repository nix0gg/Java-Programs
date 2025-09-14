import java.util.Scanner;
public class student1
{
    public static void main(String args[])
    {
        float phy,chem,math,bio,comp;
        double total, avg;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in physics:");
        phy=sc.nextFloat();
        System.out.print("Enter marks in chemistry:");
        chem=sc.nextFloat();
        System.out.print("Enter marks in maths:");
        math=sc.nextFloat();
        System.out.print("Enter marks in bio:");
        bio=sc.nextFloat();
        System.out.print("Enter marks in computer applications:");
        comp=sc.nextFloat();
        total = phy+chem+math+bio+comp;
        avg=(total/5.0);
        System.out.println("Total marks="+total);
        System.out.println("Average marks:"+avg);
    }
}