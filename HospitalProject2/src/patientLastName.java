import java.util.Comparator;

public class patientLastName implements Comparator<Patient>
{

    @Override
    public int compare(Patient pt1, Patient pt2) 
    {
        return pt1.lastName.compareTo(pt2.lastName);
    }
    
}
