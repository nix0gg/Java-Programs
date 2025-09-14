import java.util.Scanner;

    public class pattern$sumofseries
    {
        public static void main()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("1. Printing pattern");
            System.out.println("2. Finding sum of series");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter number:");
                    int num=sc.nextInt();
                    int c=0;
                    for(int i=1;i<=num;i++)
                    {
                        c++;
                    }
                    if(c==2)
                    {
                        System.out.println(num+"is prime");
                    }
                        else
                        {
                            System.out.println(num+"is not prime");
                        }
                    break;
                    case 2:
                        double sum=0;
                        for(int i=1;i<=19;i++)
                        sum=i/(double)(i+1);
                        System.out.println("Sum="+sum);
                        break;
                        default:
                            System.out.println("Incorrect Choice.");
                        }
                    }
                }
                    
                    
                
                        