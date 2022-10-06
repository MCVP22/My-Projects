public class MyForLoop {
    public static void main(String[] args) 
    {
        int i = 1;
        while (i >=5)
        {
            int s = 0;
            s +=i;
            i++;
            System.out.println(s);
        }

        int j;
        for(j=1; i >= 5; i++)
        {
            int s = 0;
            s +=j;
            System.out.println(j);
        }
    }
}
