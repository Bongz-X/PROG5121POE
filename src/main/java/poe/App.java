package poe;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

    //Registration of User Details
    
    //Scanner to allow user input
    Scanner input = new Scanner(System.in);

    //Prompt user to enter username
    System.out.println("Please enter your username (Contains _ and is a max of 5 characers long) ");
    String username = input.nextLine();

    //Validate username
    if (username.contains("_") && username.length() <= 5) {
        System.out.println("Username successfully captured.");
    } else {
        System.out.println("Username is not correctly formatted; please ensure that it contains an underscore and is no more than five characters in length.");
    }
    

    //Prompt user to enter password
    System.out.println("Please enter your password (8 characters long, contains a capital letter, a number and a special character)");
    String password = input.nextLine();

    //Validate password
    if (password.length() <= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*()].*")) {
        System.out.println("Password successfully captured.");
    } else {
        System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
    }

    //Prompt user to enter SA cell phone no
    System.out.println("Please enter your SA cell phone number (Must start with +27 and be 10 characters long) ");
    String cellPhone = input.nextLine();

    //Validate cell phone number
    if (cellPhone.matches("\\+27\\d{9}$")) {
        System.out.println("Cell phone number successfully added.");
    } else {
        System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
    }
    
    //Login Phase

    //Storing login details in login object
    Login login = new Login(username, password, cellPhone);

    //Showing registration results to user
    System.out.println(login.RegisterUser());

    //Prompt user to enter login details
    System.out.println("Please enter your username to login: ");
    String enteredUsername = input.nextLine();

    System.out.println("Please enter your password to login: ");
    String enteredPassword = input.nextLine();

    System.out.println("Please enter your cell phone number to login: ");
    String enteredCellPhone = input.nextLine();

    //Validate login details
    if (login.loginUser(enteredUsername, enteredPassword, enteredCellPhone)){
        System.out.println("Welcome back, " + enteredUsername + "!It is great to see you again.");
    } else {
        System.out.println("Login failed. Please check your username, password, and cell phone number and try again.");
    }
  }
}