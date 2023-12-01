package bridgelabzjunit;


public class UserRegistrationJunit {

	//uc1 creating the first name with valid uppercase first letter and 3 characters//
	public boolean validateFirstName(String firstName) {
        boolean isValid = firstName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("First name is valid");
            
        } else {
            System.out.println("First name is not valid ");
        }
        return isValid;
        }
	
	//uc2 creating the last name with valid uppercase first letter and 3 characters//
	public boolean validateLastName(String lastName) {
        boolean isValid = lastName.matches("[A-Z][a-z]{3,10}");
        if (isValid) {
            System.out.println("Last name is valid");
            
        } else {
            System.out.println("Last name is not valid ");
        }
        return isValid;
        }
	
	//uc3 creating the email id with valid email format//
	//uc9 creating the pattern that clear all the email samples provided samples 
	public boolean validateEmail_id(String email_id) {
        boolean isValid = email_id.matches("^[A-Za-z0-9+_.-]+@gmail\\.com$");
        if (isValid) {
            System.out.println("Email is valid");
            
        } else {
            System.out.println("Email is not valid ");
        }
        return isValid;
        }
	
	//uc4 creating the phone num with the proper + , country code and 110 digit number//
	public boolean validatePhone_Number(String phone_num) {
        boolean isValid = phone_num.matches("\\+[0-9]{1,3}[0-9]{10}$");
        if (isValid) {
            System.out.println("Phone num is valid");
            
        } else {
            System.out.println("Phone num is not valid ");
        }
        return isValid;
        }
	
	//uc5 creating the password with min of 8 character
	//uc6 creating password with atleast one uppercase
	//uc7 creating password with atleast one numeric character
	//uc8 creating password with atleast one special character
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
