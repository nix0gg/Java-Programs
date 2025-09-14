public class palindrome
{
    public static void main(int n)
    {
        int d,p,s=0;
        p=n;
        while(n>0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(p==s)
        System.out.println("It is a palindrome");
        else
        System.out.println("It is not a palindrome");
        }
    }
