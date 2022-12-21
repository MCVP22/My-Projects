public class Patient
{
    int PatientID;
    String firstName;
    String lastName;
    String Illness;
    String Notes;
    
   public Patient ()
   {
       
   }
    
   //Constructor
   public Patient(int id, String first, String last, String ill, String notes) 
   {
        this.PatientID = id;
        this.firstName = first;
        this.lastName= last;
        this.Illness = ill; 
        this.Notes = notes;
   }       
        
     
    //Setters and Getters
    public int getPatientID()
    {
        return PatientID; 
    }
    public void setPatientID(int id)
    {
        this.PatientID = id;
    }
   
    public String getFirstName()
    {
        return firstName; 
    } 
    public void setFirstName(String first)
    {
        this.firstName = first;
    }
    
    public String getLastName()
    {
        return lastName; 
    }
    public void setLastName(String last)
    {
        this.lastName = last; 
    }
    
    public String getIllness()
    {
        return Illness; 
    }
    public void setIllness(String Ill)
    {
        this.Illness = Ill; 
    }
    
    public String getNotes()
    {
        return Notes; 
    }
    public void setNotes (String notes) 
    {
        this.Notes = notes; 
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;

        result = prime * result + PatientID;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((Illness == null) ? 0 : Illness.hashCode());
        result = prime * result + ((Notes == null) ? 0 : Notes.hashCode());

        return result;
    }
    

    public boolean equals(Patient obj)
    {
        Patient other = (Patient) obj;
            
           
        if(firstName == null)
        {
            if(other.firstName != null)    
            return false;
        }
        else if (!firstName.equals(other.firstName))
        return false;      
                    
        else if (lastName == null)
        {
            if(other.lastName != null)
            return false;
        }
        else if (!lastName.equals(other.lastName))
        return false;   
            
        else if (Illness == null)
        {
            if(other.Illness != null)
            return false;
        }
        else if (!Illness.equals(other.Illness))
        return false;   
            
        if (PatientID != other.PatientID)
        return false;
            
        else if (Notes == null)
        {
            if(other.Notes != null)
            return false;
        }
        else if (!Notes.equals(other.Notes))
        return false;   
        
        return false;
    }
}
