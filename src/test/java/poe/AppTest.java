package poe;

import static org.junit.jupiter.api.Assertions.assertTrue;
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

        System.out.println("Test: kyl_1, Result: " + actualResult);
        assertTrue(actualResult, expectedResult);
    }
    //Invalid username test
    @Test
    public void testUsernameInvalid() {

        //Testing data (Kylie)
        Login user = new Login("Kyle!!!!!!!", "Password!", "+27456489787");

        //Check username validation
        boolean actualResult = user.CheckUsername();
        boolean expectedResult = false;

        System.out.println("Test: Kyle!!!!!!!, Result: " + actualResult);
        assertTrue(actualResult, expectedResult);
    }

    

}