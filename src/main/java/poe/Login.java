package poe;

//Storing Login details of user
public class Login {
    
    private String StoredUsername;
    private String StoredPassword;
    private String StoredCellPhone;

    //Constructor for Login
    public Login(String username, String password, String cellPhone) {
        this.StoredUsername = username;
        this.StoredPassword = password;
        this.StoredCellPhone = cellPhone;
    }
    
    //Username Validation
   public boolean CheckUsername(){
    if (username.contains("_") && username.length() <= 5) {
        return true;
    } else {
        return false;
    }
   }

   //Password Validation
    public boolean CheckPassword(){
     if (password.length() <= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*()].*")) {
          return true;
     } else {
          return false;
     }
    }

    //Cell Phone Validation
    
}
