import java.util.Scanner;

public class FunWithSwitchCase
{
    public static void main(String[] args)
    {
        FunWithSwitchCase fwsc = new FunWithSwitchCase();
        int printfloor = fwsc.whichFloor();

        if(printfloor == -99)
        {
            System.out.println("Invalid number");
        }
        else
        {
            System.out.println("This number floor" + printfloor);
        }
    }

    public int whichFloor()
    {
        Scanner sc = new Scanner(System.in);
        int telephone_number;
        int floor = 0;

        System.out.println("Please enter an extension number");
        telephone_number = sc.nextInt();

        switch(telephone_number)
        {
            case 6279:
            case 6127:
            {
                System.out.println("This is on the 2nd floor of SSB");
                floor = 2;
                break;
            }
            case 6520:
            {
                System.out.println("This is on the 3rd floor of SSB");
                floor = 3;
                break;
            }
            default:
            {
                System.out.println("Invalid telephone number ");
                floor = -99;
                break; //not required
            }
        }
        return floor;
    }
}