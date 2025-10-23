package StoreApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreAppTest {
    StoreApp storeApp = new StoreApp();


    @Test
    void testToBuyAnItem() {
        Item output = storeApp.buyItem("bread", 2,
                1000.0,2000.0);
        assertEquals("bread", output.getName());
        assertEquals(2, output.getQuantity());
        assertEquals(1000.0, output.getPrice());
        assertEquals(2000.0, output.getTotalPrice());

    }

    @Test
    void  testDetails(){
        Customer result = storeApp.invoice("monica","abubakar usman",
                "1312, Dabban avenue, bwari","07040548753", LocalDateTime.now()  );
        assertEquals("monica", result.getCashier());
        assertEquals("abubakar usman", result.getName());
        assertEquals("1312, Dabban avenue, bwari", result.getAddress());
        assertEquals("07040548753", result.getTelNumber());
        assertEquals(LocalDateTime.now(), result.getDateTime());
    }


}