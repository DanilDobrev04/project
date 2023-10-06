public class GetPrice {
    private double price;

    public GetPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayPrice() {
        System.out.println("Price: $" + price);
    }
}

