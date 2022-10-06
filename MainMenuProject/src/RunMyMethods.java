import java.io.IOException;
import java.util.Scanner;

public class RunMyMethods
{
    public static void main(String[] args) throws IOException
    {
        RunMyMethods rmm = new RunMyMethods();
        rmm.menu(); 

    }

    public void menu() throws IOException 
    {
        MyMethods mm = new MyMethods();
        Scanner sc = new Scanner(System.in);

        int input = 0;

        do
        {
            System.out.println("Welcome to the My Methods! Input any numbers 1-5 to access each method then press enter! Enter 6 to exit.");
            
            System.out.println("============================");
            System.out.println("1) prod No Negative");
            System.out.println("2) Find Twelve");
            System.out.println("3) MaxMinAverage");
            System.out.println("4) Grades");
            System.out.println("5) map Quest");
            System.out.println("6) Exit");
            input = sc.nextInt();

            if(input == 1)
            {
                mm.productNoNegative();
            }
            else if(input == 2)
            {
                mm.findTwelve();
            }
            else if(input == 3)
            {
                mm.maxMinAverage();
            }
            else if(input == 4)
            {
                mm.grades();
            }
            else if(input == 5)
            {
                mm.mapQuest();
            }
        } while (input != 6);
    }
}