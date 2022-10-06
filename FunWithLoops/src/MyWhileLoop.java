import java.util.Scanner;

public class MyWhileLoop
{
    public static void main(String[] args)
    {
        MyWhileLoop mwl = new MyWhileLoop();
        System.out.println("The average is: " + mwl.whileLoop());
    }
    public float whileLoop()
    {
        int num = 0, count = 0, total = 0;
        Scanner sc = new Scanner(System.in);

        while(num != -99)//test the condition
        {
            System.out.print("Enter a whole number, and -99 to quit: ");
            num = sc.nextInt(); //accept input
            count++;
            total += num; 
        }
        float average = (float) total/count; 
        System.out.println("You keyed in " + count + " numbers \n");
        System.out.println("The average is: " + average);
        return(average);
    }
}