import java.util.Scanner;
class CabServices
{
    String car_type;
    double km;
    double bill;
    public CabServices()
    {
        car_type="";
        km=bill=0.0;
    }
    public void Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car type:");
        car_type = sc.nextLine();
        System.out.print("Enter kilometers travelled:");
        km = sc.nextDouble();
      
    }
    public void Calculate()
    {
        if(car_type.equalsIgnoreCase("AC"))
        {
            if(km<=5)
            {
                bill=150;
            }
            else
            {
                bill=150+(km-5)*10;
            }
        }
        else if(car_type.equalsIgnoreCase("NON AC"))
        {
            if(km<=5)
            {
                bill=120;
            }
            else
            {
                bill=120+(km-5)*8;
            }
        }
            else
            {
                System.out.print("Wrong type");
            }
        }
        public void Display()
        {
            System.out.println("Car type:"+car_type);
            System.out.println("Total km travelled:"+km);
            System.out.println("Bill:"+bill);
        }
    public static void main(String args[])
    {
        
        CabServices cab = new CabServices();
        cab.Accept();
        cab.Calculate();
        cab.Display();
    }
}