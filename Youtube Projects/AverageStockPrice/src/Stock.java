
public class Stock {
    private int shares;
    private double price;
    private double captial;

    public void buy(double p, int s) {
        shares += s;
        price = p;
        captial += s * p;
    }
    public void sell(double p, int s) {
        shares += s;
        price = p;
        captial += s * p;
    }

    public int getShares() {
        return shares; 
    }
    public double getPrice() {
        return price;
    }
    public double getAveragePrice() {
        return captial / getShares();
    }
}
