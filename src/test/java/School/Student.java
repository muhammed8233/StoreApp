package School;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student student = new Student();

    @Test
    void setName() {
        student.setName("abubakr bala");
        assertEquals("abubakr bala", student.getName());
    }

    @Test
    void setAge() {
        student.setAge(19);
        assertEquals(19, student.getAge());
    }

    @Test
    void setPhoneNumber() {
        student.setPhoneNumber("09043225543");
        assertEquals("09043225543", student.getPhoneNumber());
    }

    @Test
    void verifyingRegisterStudent() {
        student.registerStudent("bolaji", 23, "456774876487");
        assertEquals("bolaji", student.getName());
        assertEquals(23, student.getAge());
        assertEquals("456774876487", student.getPhoneNumber());
    }
}
