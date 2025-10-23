package School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolRecordTest {
    Student records = new Student();

    @Test
    void verifyIfStudentDetailIsReturnWhenRecordIsInvoke() {
   School output = records.registerStudent("yunusa bala",20,
           "biology",  "07040548753");
    assertEquals("yunusa bala", output.getName());
    assertEquals(20, output.getAge());
    assertEquals("biology", output.getDepartment());
    assertEquals("07040548753", output.getPhoneNumber());
    }
}