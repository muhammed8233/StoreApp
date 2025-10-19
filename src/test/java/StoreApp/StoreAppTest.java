package StoreApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreAppTest {
    StoreApp storeApp = new StoreApp();

    @Test
    void testToBuyAnItem() {
        Item output = storeApp.buyItem("bread", 1, 23.0);
        assertEquals("bread", output.getName());
        assertEquals(1, output.getQuantity());
        assertEquals(23.0, output.getPrice());
    }
}