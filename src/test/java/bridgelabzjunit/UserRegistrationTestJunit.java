package bridgelabzjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestJunit {
	UserRegistrationJunit userRegistration = new UserRegistrationJunit();

	  /*given_first_name_is_vailid method is testing a first name*/
	    @Test
	    public void given_first_name_is_vailid(){
	        boolean a = userRegistration.validateFirstName("Shivaleela");
	        boolean b = userRegistration.validateFirstName("shivaleela");
	        Assert Assertions = null;
	        Assertions.assertTrue(a);
	        Assertions.assertFalse(b);
	    }

}
