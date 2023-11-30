package bridgelabzjunit;


public class UserRegistrationJunit {

	public boolean validatefirstName(String FirstName) {
        boolean isValid = FirstName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("First name is valid");
            
        } else {
            System.out.println("First name is not valid ");
        }
        return isValid;
        }
	
	public boolean validatelastName(String LastName) {
        boolean isValid = LastName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("Last name is valid");
            
        } else {
            System.out.println("Last name is not valid ");
        }
        return isValid;
        }
	
	public boolean validateEmail_id(String Email_id) {
        boolean isValid = Email_id.matches("[A-Za-z0-9+_.-]+@gmail\\.com$");
        if (isValid) {
            System.out.println("Email is valid");
            
        } else {
            System.out.println("Email is not valid ");
        }
        return isValid;
        }
	
	public boolean validatePhone_Num(String Phone_num) {
        boolean isValid = Phone_num.matches("\\+[0-9]{1,3}[0-9]{10}$");
        if (isValid) {
            System.out.println("Phone num is valid");
            
        } else {
            System.out.println("Phone num is not valid ");
        }
        return isValid;
        }
	
	public boolean validatePassword(String Password) {
        boolean isValid = Password.matches("(?=.*[A-Z])(?=.*[a-z\\\\d])[A-Za-z\\\\d]{8,}$");
        if (isValid) {
            System.out.println("Password is valid");
            
        } else {
            System.out.println("Password is not valid ");
        }
        return isValid;
        }

}
