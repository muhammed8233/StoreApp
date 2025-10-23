package StoreApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    Item item = new Item();

    @BeforeEach
    void setUp() {
    }

    @Test
    void testToVerifyTheNameOfItem() {
        item.setName("Sugar");
        assertEquals("Sugar",item.getName());
    }
    @Test
    void testToVerifyTheNumberOfItemsPurchased(){
        item.setQuantity(5);
        assertEquals(5, item.getQuantity());
    }

    @Test
    void testToConfirmThePriceOfTheItemPurchased(){
        item.setPrice(23.0);
        assertEquals(23.0, item.getPrice());
    }
    @Test
    void testToConfirmDiscountFromThePriceOfTheItemPurchased() {
        item.setName("Sugar");
        assertEquals("Sugar",item.getName());
        item.setQuantity(5);
        assertEquals(5, item.getQuantity());
        item.setPrice(100.0);
        assertEquals(100.0, item.getPrice());


    }
}