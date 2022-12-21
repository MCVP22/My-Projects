import java.util.Comparator;

public class lastName implements Comparator<Patient>
{
    @Override
    public int compare(Patient ob1, Patient ob2) 
    {
        return ob1.lastName.compareTo(ob2.lastName);
    }
}
