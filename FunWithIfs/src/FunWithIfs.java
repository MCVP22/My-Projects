import java.util.Scanner;

public class FunWithIfs 
{
    public static void main(String[] args) 
    {
        int input, sumAplus, sumA, sumAminus, sumB, sumC, sumD, sumF;
        sumAplus=sumA=sumAminus=sumB=sumC=sumD=sumF=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your numeric grade: (-99 to quit)");

        input = sc.nextInt();

        if(input==-99)
        {
            System.exit(200);
        }
        
        while(input != -99)
        {
            switch(input)
            {
                case 100:
                case 99:
                case 98:

                {
                    System.out.println("A plus");
                    sumAplus++;
                    break;
                }
                case 97: case 96: case 95: case 94:{ System.out.println(" A "); sumA++; break;}
                case 93: case 92: case 91: case 90:{ System.out.println(" A minus "); sumAminus++; break;}
            }

            if(input>=90)
            {
                sumA++;
                System.out.println(input + "  A");
            }
            else if(input>=80)
            {
                sumB++; 
                System.out.println(input + "  B");
            }
            else if(input>=70)
            {
                sumC++; 
                System.out.println(input + "  C");
            }
            else if(input>=60)
            {
                sumD++; 
                System.out.println(input + "  D");
            }
            else
            {
                sumF++; 
                System.out.println(input + "  B");
            }
            System.out.println("Enter another grade (-99 to quit): ");
            input = sc.nextInt();
        }

        System.out.println("The total number of A plus's is " + sumAplus );
        System.out.println("The total number of A's is " + sumA );
        System.out.println("The total number of A minus's is " + sumAminus );
        System.out.println("The total number of B's is " + sumB );
        System.out.println("The total number of C's is " + sumC );
        System.out.println("The total number of D's is " + sumD );
        System.out.println("The total number of F's is " + sumF );
    }
    
}
