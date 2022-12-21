import java.util.ArrayList;
import java.util.List;

public class StudentApp 
{
    public static void main (String[] args)
    {
        List<Student> list = new ArrayList<Student>();

        StudentApp app = new StudentApp();

        list.add(app.createStudent("John", "Smith", "456-23-8339", "12/22/89"));
        list.add(app.createStudent("Ruby", "Smith", "273-23-8379", "10/22/87"));
        list.add(app.createStudent("Conny", "S", "467-22-8399", "08/29/90"));
        list.add(app.createStudent("Eren", "Buckley", "426-67-8920", "12/23/99"));
        list.add(app.createStudent("Brock", "Johnson", "786-43-8939", "11/22/98"));

        app.printStudent(list);
    }

    public Student createStudent(String firstname, String lastname, String ssn, String dateofbirth)
    {
        return new Student(firstname, lastname, ssn, dateofbirth);
    }

    public void printStudent(List<Student> list)
    {
        for (Student s:list)
        {
            System.out.println("firstName: " + s.getfirstName());
            System.out.println("firstName: " + s.getlastName());
            System.out.println("SSN: " + s.getSSN());
            System.out.println("dateOfBirth: " + s.getdateOfBirth());

            System.out.println("======================");
        }
    }
}
