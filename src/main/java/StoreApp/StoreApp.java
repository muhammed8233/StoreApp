package StoreApp;

public class StoreApp {
    public Item buyItem(String name, int quantity, double price){
        if (quantity > 0){
            Item item = new Item();
            item.setName(name);
            item.setQuantity(quantity);
            item.setPrice(price);
            return item;
        }
        throw new IllegalArgumentException("Item Quantity can't be less than 1");
    }
}
