public class Student 
{
    String firstName;
    String lastName;
    String SSN;
    String dateOfBirth;

    // Constructor

    public Student(String firstname, String lastname, String ssn, String dateofbirth)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        this.SSN= ssn;
        this.dateOfBirth = dateofbirth;
    }

    // Setters and Getters

    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstname)
    {
        this.firstName = firstname;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastname)
    {
        this.lastName = lastname;
    }
    public String getSSN()
    {
        return SSN;
    }
    public void setSSN(String ssn)
    {
        this.SSN = ssn;
    }
    public String getdateOfBirth()
    {
        return dateOfBirth;
    }
    public void setdateOfBirth(String dateofbirth)
    {
        this.dateOfBirth = dateofbirth;
    }
}
