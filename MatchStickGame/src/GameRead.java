import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GameRead 
{
    Scanner sc = new Scanner(System.in); 
    private String file;
    String human; 

    public GameRead(String Human) throws IOException
    {
        File file = new File("human.txt");

        if(!file.exists())
        {
            file.createNewFile();
        }

        System.out.println("List of Humans that participated: ");
        Scanner read = new Scanner (file);

        while(read.hasNextLine())
        {
            System.out.println(read.nextLine()); 
        }
        read.close();

        FileWriter fw = new FileWriter(file, false);
        BufferedWriter br = new BufferedWriter(fw);
        br.write(human + "");
        br.close();
        fw.close();
    }
    
    public void Game()
    {
        int totalMatches = 0; 

        while(totalMatches !=21)
        {
            System.out.println("Remaining matches: " + (21 - totalMatches));
            System.out.print("Pick 1, 2, 3 or 4 matches: ");
            int s = sc.nextInt();

            while(s < 1 || s > 4 || s > (21 - totalMatches)) 
            {
                System.out.println("To many matches!!");
                System.out.print("Pick , 2, 3, or 4 matches: ");
                s = sc.nextInt();
            }

            totalMatches += s;

            if(totalMatches == 21) 
            {
                System.out.println("Machine WINS!!!");
                break;
            }
                System.out.println("Machine chose: " + (5-s) + "matches");
                totalMatches += (5-s);
                    
                System.out.println();
                    
                if(totalMatches == 21)
                {
                    System.out.println("Human WINS!!!");
                }
                    

        }

    }
    
    public static void main(String[] args) throws IOException 
        {
            System.out.println("Enter the name of the human: ");
            String human = in.nextLine();
            
            Game g = new Game(human);
            Game.Game();
            in.close();
        }
}
    




