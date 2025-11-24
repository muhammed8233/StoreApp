package StoreApp;

import java.time.LocalDateTime;

public class StoreApp {
    public Item  buyItem(String name, int quantity, double price,
                        double totalPrice) {

        if (quantity > 0) {
            Item item = new Item();
            item.setName(name);
            item.setQuantity(quantity);
            item.setPrice(price);
            item.calculateTotalPrice(totalPrice);

            return item;
        }
        throw new IllegalArgumentException("Item Quantity can't be less than 1");
    }

    public  Customer invoice(String cashier, String name, String address,
                             String telNumber, LocalDateTime dateTime) {
        Customer customer = new Customer();
            customer.setCashier(cashier);
            customer.setName(name);
            customer.setTelNumber(telNumber);
            customer.setAddress(address);
            customer.setDateTime(dateTime);

        return customer;
    }


}
