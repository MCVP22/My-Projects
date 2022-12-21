import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class PatientData 
{
    public static void main(String[] args) throws IOException
    {
        Set<Patient> patients = new TreeSet<>(new patientLastName());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Patient patient = null;

     
        for (int i = 1; i <= 10; i++) 
        {

            System.out.println("Patient ID: ");
            int ID = Integer.parseInt(br.readLine());
          
            System.out.println("Patient First Name:");
            String firstName = br.readLine();
          
            System.out.println("Patient Last Name: ");
            String lastName = br.readLine();

            System.out.println("What's the lllness: ");
            String Illness = br.readLine();

            System.out.println("General Notes: ");
            String Notes = br.readLine();

            patient = new Patient(ID, firstName, lastName, Illness, Notes);
            patients.add(patient);
        }

        int i = 1;
        for (Patient p : patients) 
        {
            System.out.println("Patient ID:" + p.PatientID + ",Patiet First Name:" + p.firstName + ",Patient Last Name:" + p.lastName + ",Patient Illness:" + p.Illness + ",Patient Notes:" + p.Notes);
            i++;
           
            System.out.println("======================================================================================================================");
        
        }
       
        System.out.println("THESE RECORDS ARE CLASSIFIED");
        System.out.println("DO NOT share patient records with any outside source");
    }
}
