package StoreApp;

public class Item {
    private String name;
    private int quantity;
    private double price;
    private double totalPrice;



    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setQuantity (int number){
        if (number > 0){
            quantity = number;
        }
    }
    public int getQuantity (){
        return quantity;
    }

    public void setPrice (double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }
    public double getPrice(){
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice(double totalPrice) {
        totalPrice = quantity * price;
        this.totalPrice = totalPrice;
    }

}
