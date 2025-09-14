import java.util.Scanner;

public class Employee {
    int pan;
    String name;
    double tax_income = 0;
    double tax;

    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter PAN: ");
        pan = sc.nextInt();
        System.out.print("Enter taxable income: ");
        tax_income = sc.nextDouble();
        sc.close();
    }

   
    public void Calculate() {
        if (tax_income <= 100000) {
            tax = 0;
        } else if (tax_income <= 150000) {
            tax = (tax_income - 100000) * 0.10;
        } else if (tax_income <= 250000) {
            tax = 5000 + (tax_income - 150000) * 0.20;
        } else {
            tax = 25000 + (tax_income - 250000) * 0.30;
        }
    }

 
    public void Display() {
        System.out.print("Pan Number \t" + "Name:\t" + "Tax-income\t" + "Tax\n");
        System.out.println(pan+"\t"+name+"\t"+tax_income+"\t"+tax);
    }

    
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.Input();
        employee1.Calculate();
        employee1.Display();
    }
}
