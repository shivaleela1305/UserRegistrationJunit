package bridgelabzjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestJunit {
	UserRegistrationJunit userRegistration = new UserRegistrationJunit();

	  /*given_first_name_valid method is testing a first name*/
	    @Test
	    public void given_first_name_is_valid(){
	        boolean isValid = userRegistration.validateFirstName("Shivaleela");
	        boolean isNotValid = userRegistration.validateFirstName("shivaleela");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Last_name_valid method is testing a last name*/
	    @Test
	    public void given_Last_name_is_valid(){
	        boolean isValid = userRegistration.validateLastName("Katti");
	        boolean isNotValid = userRegistration.validateLastName("katti");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Email_Id_valid method is testing a email id*/
	    @Test
	    public void given_Email_Id_is_valid(){
	        boolean isValid = userRegistration.validateEmail_id("shiv@gmail.com");
	        boolean isNotValid = userRegistration.validateEmail_id("shivagmail");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Phone_num_valid method is testing a phone num*/
	    @Test
	    public void given_Phone_Num_is_valid(){
	        boolean isValid = userRegistration.validatePhone_Number("+916361290015");
	        boolean isNotValid = userRegistration.validatePhone_Number("6789045678");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Password_valid method is testing a password*/
	    @Test
	    public void given_Password_is_valid(){
	        boolean isValid = userRegistration.validatePassword("Asdfghjl7@");
	        boolean isNotValid = userRegistration.validatePassword("asdfgthi2j");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }


}
