package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckTest {
    @Test
    @DisplayName("Test for Length of password")
    public void PasswordLengthTest(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.isValid("pw1234"));
    }

    @Test
    @DisplayName("Is password <25?")
    public void PasswordOverLengthTest(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.isValid("password123456789101112131425"));
    }

    @Test
    @DisplayName("Password to short")
    public void PasswordToShortTest(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.isValid("pw12"));
    }
}
