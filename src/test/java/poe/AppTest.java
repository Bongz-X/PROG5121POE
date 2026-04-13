package poe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    //Testing Validate username
    @Test
    public void testUsernameValid() {

        //Testing data (Kyl_1)
        Login user = new Login("kyl_1", "Password!", "+27456489787");

        //Check username validation
        boolean actualResult = user.CheckUsername();
        boolean expectedResult = true;

        System.out.println("Test: kyl_1, Result: " + actualResult + ", Welcome! it is great to see you again.");
        assertEquals(expectedResult, actualResult);
    }

    //Invalid username test
    @Test
    public void testUsernameInvalid() {

        //Testing data (Kylie)
        Login user = new Login("Kyle!!!!!!!", "Password!", "+27456489787");

        //Check username validation
        boolean actualResult = user.CheckUsername();
        boolean expectedResult = false;

        System.out.println("Test: Kyle!!!!!!!, Result: " + actualResult + ", username not correctly formatted, please ensure it contains an underscore and is no more than 5 characters long.");
        assertEquals(expectedResult, actualResult);
    }

    //Testing password validation
    @Test
    public void testPasswordValid() {

        //Testing data (Password!)
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "+27456489787");

        //Check password validation
        boolean actualResult = user.CheckPassword();
        boolean expectedResult = true;

        System.out.println("Test: Ch&&sec@ke99!, Result: " + actualResult + ", password successfully captured.");
        assertEquals(expectedResult, actualResult);
    }
    //Testing invalid password
    @Test
    public void testPasswordInvalid() {

        //Testing data (password)
        Login user = new Login("kyl_1", "password", "+27456489787");

        //Check password validation
        boolean actualResult = user.CheckPassword();
        boolean expectedResult = false;

        System.out.println("Test: password, Result: " + actualResult + ", password does not meet the complexity requirements, please ensure it is at least 8 characters long and contains an uppercase letter, a number and a special character.");
        assertEquals(expectedResult, actualResult);
    }
    //Cell phone validation test
    @Test
    public void testCellPhoneValid() {

        //Testing data (+27838968976)
        Login user = new Login("kyl_1", "Password!", "+27838968976");

        //Check cell phone validation
        boolean actualResult = user.CheckCellPhone();
        boolean expectedResult = true;

        System.out.println("Test: +27838968976, Result: " + actualResult + ", cell phone number successfully captured.");
        assertEquals(expectedResult, actualResult);
    }
    //Invalid cell phone test
    @Test
    public void testCellPhoneInvalid() {

        //Testing data (08966553)
        Login user = new Login("kyl_1", "Password!", "08966553");

        //Check cell phone validation
        boolean actualResult = user.CheckCellPhone();
        boolean expectedResult = false;

        System.out.println("Test: 08966553, Result: " + actualResult + ", cell phone number incorrectly formatted or does not contain international code, please correct the number and try again.");
        assertEquals(expectedResult, actualResult);
    }

    //True/False testing methods
    
    //Username
    @Test
    public void testUsernameCorrectlyFormatted() {
        Login user = new Login("kyl_1", "Password!", "+27456489787");

        assertTrue(user.CheckUsername());
    }
    @Test
    public void testUsernameNotCorrectlyFormatted() {
        Login user = new Login("Kyle!!!!!!!", "Password!", "+27456489787");

        assertFalse(user.CheckUsername());
    }

    //Password Tests
    @Test
    public void testPasswordMeetsComplexityRequirements() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "+27456489787");

        assertTrue(user.CheckPassword());
    }
    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        Login user = new Login("kyl_1", "password", "+27456489787");

        assertFalse(user.CheckPassword());
    }

    //Cell phone tests
    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login user = new Login("kyl_1", "Password!", "+27838968976");

        assertTrue(user.CheckCellPhone());
    }
    @Test
    public void testCellPhoneNotCorrectlyFormatted() {
        Login user = new Login("kyl_1", "Password!", "08966553");

        assertFalse(user.CheckCellPhone());
    }
}
