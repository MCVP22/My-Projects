public class Index {
   public static int findIndex (int[] my_array, int t)
    {
        if(my_array == null)
        {
            return -1;
        }
        
        int len = my_array.length;
        int i = 0;
        
        while (i < len)
        {
            if (my_array[i] == t)
            {
                return i;
            }
        }
        return -1;
    }
   
   public static void main(String[] args)
    {
        int[] my_array = {0,1,2,3,4,5,6};
        System.out.println("Index position of 4 is: " + findIndex(my_array, 4));
        System.out.println("Index position of 6 is: " + findIndex(my_array, 6));
    }
}
