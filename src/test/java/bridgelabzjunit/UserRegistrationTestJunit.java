package bridgelabzjunit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTestJunit {
	// UC10:validating all the user credentials by its respective term

	/* given_first_name_valid method is testing a first name */
	@Test
	public void given_first_name_is_valid() {
		UserRegistrationJunit userRegistration = new Firstname();
		boolean isValid = userRegistration.validate("Shivaleela");
		boolean isNotValid = userRegistration.validate("shivaleela");
		assertTrue(isValid);
		assertFalse(isNotValid);
	}

	/* given_Last_name_valid method is testing a last name */
	@Test
	public void given_Last_name_is_valid() {
		UserRegistrationJunit userRegistration = new Lastname();
		boolean isValid = userRegistration.validate("Katti");
		boolean isNotValid = userRegistration.validate("katti");
		assertTrue(isValid);
		assertFalse(isNotValid);
	}

	/* given_Email_Id_valid method is testing a email id */
	@ParameterizedTest
	@ValueSource(strings = {"shiv@gmail.com", "rhu@gmail.com"})

	void testMultipleEmail_id(String email) {
		UserRegistrationJunit userRegistration = new Email_id();

		boolean isValid = userRegistration.validate("shiv@gmail.com");
		boolean isNotValid = userRegistration.validate("shivagmail");
		assertTrue(isValid);
		assertFalse(isNotValid);
	}

	/* given_Phone_num_valid method is testing a phone num */
	@Test
	public void given_Phone_Num_is_valid() {
		UserRegistrationJunit userRegistration = new Phone_num();
		boolean isValid = userRegistration.validate("+916361290015");
		boolean isNotValid = userRegistration.validate("6789045678");
		assertTrue(isValid);
		assertFalse(isNotValid);
	}

	/* given_Password_valid method is testing a password */
	@Test
	public void given_Password_is_valid() {
		UserRegistrationJunit userRegistration = new Password();
		boolean isValid = userRegistration.validate("Asdfghjl7@");
		boolean isNotValid = userRegistration.validate("asdfgthi2j");
		assertTrue(isValid);
		assertFalse(isNotValid);
	}
}
