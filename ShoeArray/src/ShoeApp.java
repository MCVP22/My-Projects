import java.util.ArrayList;
import java.util.List;

public class ShoeApp
{
    public static void main (String[] args)
    {
        List<Shoe> list = new ArrayList<Shoe>();

        ShoeApp app = new ShoeApp();

        list.add(app.createShoe("Nike", "14", "basketball"));
        list.add(app.createShoe("Adidas", "7 1/2", "cloudfoam runners"));
        list.add(app.createShoe("Brooks", "9 1/2", "rock climbing"));
        list.add(app.createShoe("ASICS", "10", "boots"));
        list.add(app.createShoe("Saucony", "13", "running"));

        app.printShoe(list);
    }

    public Shoe createShoe(String name, String size, String model)
    {
        return new Shoe(name, size, model);
    }

    public void printShoe(List<Shoe> list)
    {
        for (Shoe s:list)
        {
            System.out.println("Name: " + s.getName());
            System.out.println("Size: " + s.getSize());
            System.out.println("Model: " + s.getModel());

            System.out.println("======================");
        }
    }
}