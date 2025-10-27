package School;


import org.junit.jupiter.api.Test;

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
        for (Student record: student.records) {
             student.registerStudent("bolaji", 23, "456774876487");
            assertEquals("bolaji", record.getName());
            assertEquals(23, record.getAge());
            assertEquals("456774876487", record.getPhoneNumber());
        }
    }

    @Test
    void testTOViewRecord(){
        Student student = new Student();
        student.registerStudent("bolaji", 23, "456774876487");
        student.viewRegisteredStudent();

    }

    @Test
    void verifyingUpdatingOfStudentRecord(){
        Student student1 = new Student();
            student1.registerStudent("bolaji", 23, "456774876487");
        student1.viewRegisteredStudent();

            Student record = student1.updateStudentRecord("psc/2025/01", "salihi",
                    17, "09043225543");

            assertEquals("salihi", record.getName());
            assertEquals(17, record.getAge());
            assertEquals("09043225543", record.getPhoneNumber());
        student1.viewRegisteredStudent();
    }

    @Test
    void verifyToCheckDeleteOfStudentRecord(){
        Student student = new Student();
        student.registerStudent("bolaji", 23, "456774876487");
        student.registerStudent("bala", 34, "5467899876");

        Student result = student.deleteStudentRecord("psc/2025/01");
        assertEquals("bolaji", result.getName());
       assertEquals(23, result.getAge());
        assertEquals("456774876487", result.getPhoneNumber());

        student.viewRegisteredStudent();

    }
}
