package StoreApp;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer();

    @Test
    void setAddress() {
         customer.setAddress("No_23 Dabban Avenue, Zango Bwari");
        assertEquals("No_23 Dabban Avenue, Zango Bwari", customer.getAddress());
    }

    @Test
    void setName() {
        customer.setName("abubakr usman");
        assertEquals("abubakr usman",customer.getName());
    }

    @Test
    void setTelNumber() {
        customer.setTelNumber("07040548753");
        assertEquals("07040548753", customer.getTelNumber());
    }

    @Test
    void setCashier() {
        customer.setCashier("monica");
        assertEquals("monica", customer.getCashier());
    }

    @Test
    void testAmount() {
        customer.setAmount(1000);
        assertEquals(1000, customer.getAmount());

    }
}
