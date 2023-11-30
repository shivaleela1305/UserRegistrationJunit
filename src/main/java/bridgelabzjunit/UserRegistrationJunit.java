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

}
