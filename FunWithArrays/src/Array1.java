public class Array1 {
    public static void main(String[] args)
    {
        Array1 a1 = new Array1();
        int[] scores = {5, 5, 12, 17, 11};
        float avg = a1.averData(scores, scores.length);
        System.out.println("Average score" + avg);
    }
    private float averData(int[] numbers, int size)
    {
        int i, sum;
        for(i=0, sum=0; i<size; i++)
        {
            System.out.println("score " + (i+1) + "=" + numbers[i]);
            sum += numbers[i];
        }
        return((float) sum/i);
    }
}
