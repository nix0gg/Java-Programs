public class NumPattern10
{
    public static void main(String args[])
    {
        int rows=5;
        int count =1;
        {
            for(int i=1;i<=rows;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(count + "");
                }
                System.out.println();
            }
        }
    }
}