import java.util.Scanner;

public class Game 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String human;
       int matchstick;
       int total =0;

       System.out.println("Rules:");
       System.out.println("Human and Machine take turns drawing matches");
       System.out.println("HUMAN!! You can chose 1, 2, 3, or 4 matches");

       System.out.println("NOW!! Enter your name: ");
       human = sc.next();

       while(total < 21)
       {
            System.out.println("Pull your matches:" + human);
            matchstick = sc.nextInt(); 

            while(matchstick > 4)
            {
                System.out.println("You drew to many matches! Re-draw (1, 2, 3 or 4)");
                matchstick = sc.nextInt();
            }

            System.out.println("You drew" + matchstick + "matches. Total matches: " + total);
            total += matchstick;
            
            System.out.println("Your turn Machine!!");
                         
            if (matchstick == 1)
            {
                total += 4;
                System.out.println("Machine chose 4 mathces");
            }
            if (matchstick == 2)
            {
                total += 3;
                System.out.println("Machine chose 3 mathces");
            }
            if (matchstick == 3)
            {
                total += 2;
                System.out.println("Machine chose 2 mathces");
            }
            if (matchstick == 4)
            {
                total += 1;
                System.out.println("Machine chose 1 matches");
            }
            if (total >= 21)
            {
                System.out.println("YOU DREW THE LAST MATCH!! YOU LOSE HAHAHAHA!!!");
                return;
            }

       }  

    }

    public void playGame()
    {
        Game g = new Game(null);
    }

    Game(String human)
    {

    }
}
