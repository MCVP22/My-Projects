import java.util.Scanner;

public class MyDoWhileLoop 
{
    public static void main(String[] args)
    {
        MyDoWhileLoop mdwl = new MyDoWhileLoop();
        System.out.println("The average is:" + mdwl.average());
    }
    
    public float average()
    {
        Scanner sc = new Scanner(System.in);
        int num = 0, count = 0, total = 0;
        do
        {
            System.out.println("Enter a whole number, and -99 to quit: ");
            num = sc.nextInt(); //accept input
            count++; //increment counter
            total += num; //accumulate the sum
        }
        
        while(num !=-99); //test the condition
        float average = (float)total/count;
        System.out.println("You keyed in" + count + "numbers \n");
        System.out.println("The average is: " + average);
        return(average);
    }
}
