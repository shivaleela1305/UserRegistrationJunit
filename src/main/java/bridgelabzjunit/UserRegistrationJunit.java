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

}
