package poe;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

    //Registration of User details
    
    //Scanner to allow user input
    try (Scanner input = new Scanner(System.in)) {
        Login user = null;

        //Menu to select registration or login
        int choice;
        do {
            System.out.println("---Menu---");
            System.out.println("Please select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            choice= input.nextInt();
            input.nextLine();

            switch (choice){

                //Registration Phase
                case 1:
                    System.out.println("Please enter your username (Contains _ and is a max of 5 characers long) ");
                    String username = input.nextLine();

                    System.out.println("Please enter your password (8 characters long, contains a capital letter, a number and a special character)");
                    String password = input.nextLine();

                    System.out.println("Please enter your SA cell phone number (Must start with +27 and be 10 characters long) ");
                    String cellPhone = input.nextLine();

                    user = new Login(username, password, cellPhone);

                    //Showing registration results to user

                    //Username
                    if(user.CheckUsername()){
                        System.out.println("Username successfully captured.");
                    } else {
                        System.out.println("Username is not correctly formatted; please ensure that it contains an underscore and is no more than five characters in length.");
                    }

                    //Password
                    if(user.CheckPassword()){
                        System.out.println("Password successfully captured.");
                    } else {
                        System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
                    }

                    //Cell Phone
                    if(user.CheckCellPhone()){
                        System.out.println("Cell phone number successfully captured.");
                    } else {
                        System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
                    }
                    
                    //Final registration result confriming details are correct and user is registered
                    if (user.CheckUsername() && user.CheckPassword() && user.CheckCellPhone()) {
                        System.out.println("Above conditions have been met. User successfully registered.");
                    } else {
                        System.out.println("Registration unsuccessful. Please check the requirements for each field and try again.");
                    }
                    break;


                //Login Phase

                //Letting user know they can't login without registering first
                case 2:
                    if (user == null){
                        System.out.println("Register first before attempting to login!");
                        break;
                    }

                //Prompt user to enter login details
                System.out.println("Please enter your username to login: ");
                String enteredUsername = input.nextLine();

                System.out.println("Please enter your password to login: ");
                String enteredPassword = input.nextLine();

                System.out.println("Please enter your cell phone number to login: ");
                String enteredCellPhone = input.nextLine();

                //Login feedback to user
                boolean loginSuccess = user.loginUser(enteredUsername, enteredPassword, enteredCellPhone);

                if (loginSuccess){
                    System.out.println("Welcome back, " + enteredUsername + "! It is great to see you again.");
                } else {
                    System.out.println("Login unsuccessful. Please check your credentials and try again.");
                }

                //Exit message
                case 3:
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;

                //Default case for invalid menu option
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");

            }
        } while (choice != 3);
    }
    }
}
