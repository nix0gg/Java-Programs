import java.util.Scanner;
class mathfunction
{
    public static void main()
    {
        int a,b,c,x =0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        System.out.print("Enter the third number:");
        c=sc.nextInt();
        x=Math.max(a,b);
        int max= Math.max(x,c);
        System.out.println("The largest number is:"+max);
        
    }
}