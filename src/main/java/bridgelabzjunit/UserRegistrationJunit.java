package bridgelabzjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface UserRegistrationJunit {
	boolean validate(String input);
}

// uc1 creating the first name with valid uppercase first letter and 3
// characters//
class Firstname implements UserRegistrationJunit {
	@Override
	public boolean validate(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		if (result) {
			return true;

		} else {
			return false;
		}
	}
}

// uc2 creating the last name with valid uppercase first letter and 3
// characters//
class Lastname implements UserRegistrationJunit {
	@Override
	public boolean validate(String lastName) {
		boolean isValid = lastName.matches("[A-Z][a-z]{3,}");
		if (isValid) {
			return true;
		} else {
			return false;
		}
	}
}

// uc3 creating the email id with valid email format//
// uc9 creating the pattern that clear all the email samples provided samples
class Email_id implements UserRegistrationJunit {
	@Override
	public boolean validate(String email_id) {
		boolean isValid = email_id.matches("^[A-Za-z0-9+_.-]+@gmail\\.com$");
		if (isValid) {
			return true;

		} else {
			return false;
		}
	}
}

// uc4 creating the phone num with the proper + , country code and 110 digit
// number//
class Phone_num implements UserRegistrationJunit {
	@Override
	public boolean validate(String phone_num) {
		boolean isValid = phone_num.matches("\\+[0-9]{1,3}[0-9]{10}$");
		if (isValid) {
			return true;

		} else {
			return false;
		}
	}
}

// uc5 creating the password with min of 8 character
// uc6 creating password with atleast one uppercase
// uc7 creating password with atleast one numeric character
// uc8 creating password with atleast one special character
class Password implements UserRegistrationJunit {
	@Override
	public boolean validate(String password) {
		boolean isValid = password.matches("(?=.*[A-Z])(?=.*[a-z\\d])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
		if (isValid) {
			return true;

		} else {
			return false;
		}
	}
}
