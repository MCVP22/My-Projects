import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyMethods
{
    public void productNoNegative() throws IOException
    {
        System.out.println("Welcome to product No Negative");
        System.out.print("Enter a list of values");
        
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String strNums[] = s.split("");

        int prod = 1;
        int num = 0;
        for (int i = 0; i< strNums.length; i++)
        {
            num = Integer.parseInt(strNums[i]);
            if(num >= 0)
            {
                prod = prod * num;
                System.out.println("Product is: " + prod);
            }
        }return;
    }

    public void findTwelve() throws IOException
    {
        System.out.println("Welcome to find Twelve");
        int input, first, last, count, num;
        input=first=last=count=num=0;

        System.out.println("Enter a list of values down below.");
        System.out.println("Enter your values: ");

        BufferedReader br; 
        br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        while (st.hasMoreTokens())
        {
            input = Integer.parseInt(st.nextToken());
            count++;

            if(first == 0)
            {
                if(input == 12)
                {
                    first = count;
                    last = count;
                    num++;
                }
                else
                {
                    if(input == 12)
                    {
                        last = count;
                        num++;
                    }
                }
            }
            
            System.out.println("The first occurence of 12 is here: " + first);

            if(first != 0)
            {
                System.out.println("The last occurence is here: " + last);
            }
        }
    }

    public void maxMinAverage() throws IOException
    {
        System.out.println("Welcome to maxMinAverage");
        System.out.println("Enter a list of numbers to find the max, min, and average: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int total = 0;

        while(st.hasMoreTokens())
        {
            int Num = Integer.parseInt(st.nextToken());

            if(Num >= max)
            {
                max = Num;
            }

            if(Num <= min)
            {
                min = Num;
            }
            count++;
            total += Num;
        }

        float average = (float) total/count;
        System.out.println("You chose " + count + " numbers \n");
        System.out.println("Average is: " + average);
        System.out.println("Min value:" + min);
        System.out.println("Max value:" + max);
    }

    public void grades() throws IOException
    {
        int input, sumA, sumB, sumC, sumD, sumF;
        sumA=sumB=sumC=sumD=sumF=0;

        System.out.println("Enter a series of numeric grades: ");

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        while(st.hasMoreTokens())
        {
            input = Integer.parseInt(st.nextToken());
            
            if(input>=90)
            {
                 sumA++;
                 System.out.println(input + " A");
            }
            else if(input >= 80)
            {
                 sumB++;
                 System.out.println(input + " B");
            }
            else if(input >= 70)
            {
                 sumC++;
                 System.out.println(input + " C");
            }
            else if(input >= 60)
            {
                 sumD++;
                 System.out.println(input + " D");
            }
            else
            {
                 sumF++;
                 System.out.println(input + " F");
            }
 
        }
            System.out.println("The total number of A's is " + sumA);
            System.out.println("The total number of B's is " + sumB);
            System.out.println("The total number of C's is " + sumC);
            System.out.println("The total number of D's is " + sumD);
            System.out.println("The total number of F's is " + sumF);
    }

    public void mapQuest() throws IOException
    {
        System.out.println("Welcome to Map Quest for the United States");
        int area_code = 0;

        int whichArea;
        {
            Scanner sc = new Scanner(System.in);
            int city;
            area_code = 0;

            System.out.println("You live in Missouri");
            System.out.println("Excellent now enter your area code: ");
            city = sc.nextInt();


            switch(city)
            {
                case 314:
                {
                    System.out.println("You live in St. Louis City/County");
                    area_code = 314;
                    break;
                }
                
                case 417:
                {
                    System.out.println("You live in Branson/Joplin/Lebanon/Ozark/Springfield.");
                    area_code = 417; 
                    break;
                }
                
                case 573:
                {
                    System.out.println("You live in Cape Girardeau/Columbia/Farmington/Jefferson City, or Potosi MO.");
                    area_code = 573; 
                    break;
                }
                
                case 636:
                {
                    System.out.println("You live in Chesterfield/Lake St. Louis/O'Fallon/St. Charles/St. Peters/Wentzville.");
                    area_code = 636;
                    break;
                }
          
                case 660:
                {
                     System.out.println("You live in either Brookfield, Kirksville. Marshall, Maryville, Moberly, Sedalia, or Warrensburg MO.");
                     area_code = 660; 
                     break;
                }
                
                case 816:
                {
                     System.out.println("You live in either Blue Springs , Grandview, Kanasa City, Liberty, or St. Jeosph MO.");
                     area_code = 816; 
                     break;
                }
                
	            default:  
                {
			        System.out.println("Howdy partner!! Seems like you're somewhere in the US");
                    area_code = -99;
                    break;
		        }
            }
        }
    }
}
