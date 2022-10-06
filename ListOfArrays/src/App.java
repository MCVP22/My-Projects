import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main(String[] args)  
    {
       List <Books> list = new ArrayList<Books>();

       App app = new App();

       list.add(app.createBooks("Learning Java", "3233hh", "Herbert Scheildt"));
       list.add(app.createBooks("Learning Ruby", "4567gg", "John Adams"));
       list.add(app.createBooks("Learning Angular", "1111jj", "Cole Edwards"));
       list.add(app.createBooks("Learning React", "6736FF", "Mr. Google"));
       list.add(app.createBooks("Learning Elm", "4453kk", "David Appple"));
       list.add(app.createBooks("Learning NextStep", "3233hh", "Steve Jobs"));

       app.printBooks(list);
    }

    public Books createBooks(String name, String isbn, String author)
    {
        return new Books(name, isbn, author);
    }

    public void printBooks(List<Books> list)
    {
        for(Books b:list)
        {
            System.out.println("Name: " + b.getName());
            System.out.println("ISBN: " + b.getIsbn());
            System.out.println("Author: " + b.getAuthor());
            
            System.out.println("==========================");
        }


    }
}
