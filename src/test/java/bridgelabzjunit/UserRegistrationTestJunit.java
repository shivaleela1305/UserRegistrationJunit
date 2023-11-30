package bridgelabzjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestJunit {
	UserRegistrationJunit userRegistration = new UserRegistrationJunit();

	  /*given_first_name_vailid method is testing a first name*/
	    @Test
	    public void given_first_name_is_valid(){
	        boolean isValid = userRegistration.validatefirstName("Shivaleela");
	        boolean isNotValid = userRegistration.validatefirstName("shivaleela");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Last_name_valid method is testing a first name*/
	    @Test
	    public void given_Last_name_is_valid(){
	        boolean isValid = userRegistration.validatelastName("Katti");
	        boolean isNotValid = userRegistration.validatelastName("katti");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }
	    
	    /*given_Email_Id_valid method is testing a first name*/
	    @Test
	    public void given_Email_Id_is_valid(){
	        boolean isValid = userRegistration.validateEmail_id("shiv@gmail.com");
	        boolean isNotValid = userRegistration.validateEmail_id("shivagmail");
	        Assert Assertions = null;
	        Assertions.assertTrue(isValid);
	        Assertions.assertFalse(isNotValid);
	    }

}
