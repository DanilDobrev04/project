public class Order extends Register{
    private float price;

    public Order(String firstName, String lastName, String middleName, String knowlage, long numberPhone, String gmail) {
        super(firstName, lastName, middleName, knowlage, numberPhone, gmail);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
