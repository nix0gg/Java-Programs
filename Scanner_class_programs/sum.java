import java.util.Scanner;
class sum
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any two positivie integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter an option to make a calculation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Modulus");
        int ch=sc.nextInt();
        float calc=0;
        switch(ch)
        {
         case 1:
             calc=a+b;
             System.out.println(a+"+"+b+"="+calc);
             break;
             case 2:
                 calc=a-b;
                 System.out.println(a+"-"+b+"="+calc);
                 break;
                 case 3:
                     calc=a/b;
                     System.out.println(a+"/"+b+"="+calc);
                     break;
                     case 4:
                         calc=a*b;
                         System.out.println(a+"*"+b+"="+calc);
                         break;
                         case 5:
                             calc=a%b;
                             System.out.println(a+"%"+b+"="+calc);
                             break;
                             default:
                                 System.out.println("Wrong choice, try again.");
                 
    }
}
}