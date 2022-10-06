import java.io.IOException;
import java.util.Scanner;

public class RunMapQuest
{
    public static void main(String[] args) throws IOException
    {
        RunMapQuest rmq = new RunMapQuest();
        rmq.menu();         
    }

    public void menu() throws IOException 
    {
        MapQuestFinder mqf = new MapQuestFinder();
        Scanner sc = new Scanner(System.in);

        int input = 0;

        do
        {
            System.out.println("Welcome to Map Quest! Choose one of the states below");

            System.out.println("1) Alabama");
            System.out.println("2) Alaska");
            System.out.println("3) Arizona");
            System.out.println("4) Arkansas");
            System.out.println("5) Colorado");
            System.out.println("6) Connecticut");
            System.out.println("7) Delaware");
            System.out.println("8) Georgia");
            System.out.println("9) Missouri");
                                  
            System.out.println("10) Exit");
            input = sc.nextInt();

            if(input == 1)
            {
                mqf.Alabama();
            }
            if(input == 2)
            {
                mqf.Alaska();
            }
            if(input == 3)
            {
                mqf.Arizona();
            }
            if(input == 4)
            {
                mqf.Arkansas();
            }
            if(input == 5)
            {
                mqf.Colorado();
            }
            if(input == 6)
            {
                mqf.Connecticut();
            }
            if(input == 7)
            {
                mqf.Delaware();
            }
            if(input == 8)
            {
                mqf.Georgia();
            }
            if(input == 9)
            {
                mqf.Missouri();
            }
           
        } while (input != 10);
    }
}

