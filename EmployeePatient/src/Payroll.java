import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) throws IOException 
    {
        Payroll myEMP = new Payroll();
        myEMP.menu();

        Payroll myTest = new Payroll();
        myTest.populate();
        myTest.loadEmployee();
        myTest.saveEmployee();
        myTest.showEmployee();
    }

    private Object sc;

    /* Menu */
    public void menu()
    {
        Scanner sc = new Scanner(System.in); 
        int input;

        do
        {
            System.out.println("1) Populate Employee");
            System.out.println("2) Select Employee");
            System.out.println("3) Load Employee");
            System.out.println("4) Save Employee");
            System.out.println("5) Exit");
            input = Integer.parseInt(sc.next());
            
            switch (input)
            {
                case 1:
                    populate();
                    break;
                case 2:
                    select();
                    break;
                case 3:
                    loadEmployee();
                    break;
                case 4:
                    saveEmployee();
                    break;
                default:
                    break;
            }
        }
        while (input != 5);
    }

    public void populate() 
    {
        String Fname;
        String Lname;
        int temphours;
        int temprate;
        Scanner sc = new Scanner(System.in); 
        
        for(int i = 0; i < myEmployee.length; i++)
        {
            if(myEmployee[i] == null)
            {
                System.out.println("Please enter the first name of the Employee: ");
                Fname = sc.next();
                System.out.println("Please enter the last name of the Employee: ");
                Lname = sc.next();
                System.out.println("Please enter hours worked: ");
                temphours = Integer.parseInt(sc.next());
                System.out.println("Please enter employee's rate: ");
                temprate = Integer.parseInt(sc.next());
                    
                myEmployee[i] = new Employee(Fname, Lname, temphours, temprate);
                myEmployee[i].computeGross();
                myEmployee[i].computeTax();
                myEmployee[i].computeNet();
                myEmployee[i].computeNetperc();
                break;
            }
        }
    }

    public void select()
    {
        String tempFname;
        String tempLname;
        int index = -99;

        for (int i = 0; i < myEmployee.length; i++)
        {
            System.out.println("Enter name to find:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            try
            {
                tempFname = br.readLine();
                tempLname = br.readLine();
            }
            catch(IOException ioe)
            {
                System.out.println("Something went wrong with your input name try again");
                i=-1;
                continue;
            }

            if(myEmployee[i].getFname().equalsIgnoreCase(tempFname))
            {
                index = i;
                break;
            }

            if(index != -99)
            {
                myEmployee[index].menu();
            }
            else
            {
                System.out.println("Employee not found, please try again.");
            }
        }


    }

    public void loadEmployee() 
    {
        boolean exit  = true;
            
            try
            {
                FileInputStream fis = new FileInputStream("EmployeeINFO.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Employee[] myEmployee = (Employee[]) ois.readObject();
                fis.close();
            }
            catch(Throwable e)
            {
                System.out.println(e);
            }
    }

    public void saveEmployee() 
    { 
        try
        {
            FileOutputStream fos = new FileOutputStream("EmployeeINFO.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(myEmployee[]);
            oos.flush();
            fos.close();
        }
        catch(IOException IOE)
        {
            System.err.println(IOE.getMessage());
        }
    }

    public void showEmployee()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println(myEmployee[i].getFname() + " " + myEmployee[i].getLname());    
        }
    }   
}
