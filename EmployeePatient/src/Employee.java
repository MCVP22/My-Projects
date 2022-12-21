import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable 
{
    /* Attributes */

    private String Fname;
    private String Lname;
    float rate = 30.0f;
    float taxrate = 0.2f;
    int hours = 45;
    float gross = 0.0f;
    float tax = 0.0f;
    float net = 0.0f;
    float net_percentage = 0.0f;

    /* Consructors */
    public Employee()
    {
        Fname = "Clarence Baker";
        hours = 45;
        rate = 30.0f;
    }

    Employee(String Fname, String Lname, int hours, int rate)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.hours = hours;
        this.rate = rate;
    }

    public String getFname()
    {
        return Fname;
    }

    public String getLname()
    {
        return Lname;
    }

    public int hours()
    {
        return hours;
    }

    public float rate()
    {
        return rate;
    }

    /* Methods */
    public void menu()
    {
        Scanner sc = new Scanner(System.in);

        int selection;
        
        boolean exit = false;

        while(!exit)
        { 
            System.out.println("Please select an option: ");
            System.out.println("=======================");
            System.out.println("1) Calculate Gross Pay");
            System.out.println("2) Calculate Tax");
            System.out.println("3) Calculate Net Pay");
            System.out.println("4) Calculate Net Percent");
            System.out.println("5) Display All");
            System.out.println("6) EXIT");
            selection = sc.nextInt();

            if (selection < 1 || selection > 6)
            {
                System.out.println("Invalid choice. Try again: ");
            }

            switch (selection)
            {
                case 1: 
                    computeGross();
                    break;
                case 2: 
                    computeTax();
                    break;
                case 3: 
                    computeNet();
                    break;
                case 4: 
                    computeNetperc();
                    break;
                case 5: 
                    displayEmployee();
                    break;
                case 6: 
                    exit = true;
                    break;
            }
        }
    }

    public void computeGross() 
    {
        gross = rate * hours;
    } 

    protected void computeTax()
    {
        tax = gross * taxrate;
    }

    protected void computeNet()
    {
        net = gross-tax;
    }

    protected void computeNetperc()
    {
        net_percentage = (net/gross)*100;
    }

    protected void displayEmployee()
    {
        computeGross();
        computeTax();
        computeNet();
        computeNetperc();

        System.out.println("Employee Name: " + Lname + Fname);
        System.out.println("Rate: " + rate);
        System.out.println("Gross: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net: " + net);
        System.out.println("Net%: " + net_percentage);

    }
}