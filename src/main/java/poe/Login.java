package poe;

//Storing Login details of user
public class Login {
    
    private final String StoredUsername;
    private final String StoredPassword;
    private final String StoredCellPhone;

    //Constructor for Login
    public Login(String username, String password, String cellPhone) {
        this.StoredUsername = username;
        this.StoredPassword = password;
        this.StoredCellPhone = cellPhone;
    }
    
    //Username Validation
    public boolean CheckUsername(){
        if (StoredUsername.contains("_") && StoredUsername.length() <= 5) {
            return true;
        }
        return false;
    }

    //Password Validation
    public boolean CheckPassword(){
        if (StoredPassword.length() <= 8 && StoredPassword.matches(".*[A-Z].*") && StoredPassword.matches(".*[0-9].*") && StoredPassword.matches(".*[!@#$%^&*()].*")) {
            return true;
        }
        return false;
    }

    //Cell Phone Validation
    public boolean CheckCellPhone(){
        if (StoredCellPhone.matches("\\+27\\d{9}$")) {
            return true;
        }
        return false;
    }

    //Registration error messages for user
    public String RegisterUser(){
        if (!CheckUsername()){
            return "Username is not correctly formatted.";
        }
        if (!CheckPassword()){
            return "Password does not meet the complexity requirements";
        }
        if (!CheckCellPhone()){
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }else {
            return "Above conditions have been met. User successfully registered.";
        }
    }

    //Login check
    public boolean loginUser(String enteredUsername, String enteredPassword, String enteredCellPhone){
        return enteredUsername.equals(StoredUsername) && enteredPassword.equals(StoredPassword) && enteredCellPhone.equals(StoredCellPhone);
    }
}