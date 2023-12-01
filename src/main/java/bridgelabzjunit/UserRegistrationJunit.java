package bridgelabzjunit;


public class UserRegistrationJunit {

	public boolean validateFirstName(String firstName) {
        boolean isValid = firstName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("First name is valid");
            
        } else {
            System.out.println("First name is not valid ");
        }
        return isValid;
        }
	
	public boolean validateLastName(String lastName) {
        boolean isValid = lastName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("Last name is valid");
            
        } else {
            System.out.println("Last name is not valid ");
        }
        return isValid;
        }
	
	public boolean validateEmail_id(String email_id) {
        boolean isValid = email_id.matches("[A-Za-z0-9+_.-]+@gmail\\.com$");
        if (isValid) {
            System.out.println("Email is valid");
            
        } else {
            System.out.println("Email is not valid ");
        }
        return isValid;
        }
	
	public boolean validatePhone_Number(String phone_num) {
        boolean isValid = phone_num.matches("\\+[0-9]{1,3}[0-9]{10}$");
        if (isValid) {
            System.out.println("Phone num is valid");
            
        } else {
            System.out.println("Phone num is not valid ");
        }
        return isValid;
        }
	
	public boolean validatePassword(String password) {
        boolean isValid = password.matches("(?=.*[A-Z])(?=.*[a-z\\d])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        if (isValid) {
            System.out.println("Password is valid");
            
        } else {
            System.out.println("Password is not valid ");
        }
        return isValid;
        }
	

}
