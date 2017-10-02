package StudentReg;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void getUsername() throws Exception {
        Student s1 = new Student("SeanORiordan", "06/11/1996", "A1234");
        String actual = s1.getUsername();
        String expected = "SeanORiordan20";
        assertEquals(actual, expected);
    }

}