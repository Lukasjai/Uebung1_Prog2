package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckTest {
    @Test
    @DisplayName("Test for Length of password")
    public void PasswordLengthTest() {
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.isValid("pw1234645"));
    }

    @Test
    @DisplayName("Is password <25?")
    public void PasswordOverLengthTest() {
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.isValid("password123456789101112131425"));
    }

    @Test
    @DisplayName("Password to short")
    public void PasswordToShortTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.isValid("pw12");
        assertFalse(actual);
    }


    @Test
    @DisplayName("Password contains numbers")
    public void PasswordContainsNumbersTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.containsNumbers("123456789");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Password contains big and small letters")
    public void PasswordBigSmallLettersTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.bigSmallLetters("AaBbCc");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Password must contain one of these ()#$?!%/@")
    public void PasswordSpecialSignTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.specialSign("()#$?!%/@");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Password must not any other special signs than ()#$?!%/@")
    public void PasswordNoSpecialSignTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.noSpecialSign("€&§[]}+-");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Password must not contain following numbers")
    public void PasswordNoFollowingNumbersTest() {
        PasswordCheck pw = new PasswordCheck();
        boolean actual = pw.followingNumbers("123");
        assertFalse(actual);
    }

}
