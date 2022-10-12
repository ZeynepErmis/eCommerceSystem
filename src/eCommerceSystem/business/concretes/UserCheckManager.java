package eCommerceSystem.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstarcts.UserCheckService;
import eCommerceSystem.entity.concretes.User;

public class UserCheckManager implements UserCheckService {

	List<String> emailList = new ArrayList<String>();
	
	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("This field cannot be left blank.");
			return false;
		} else if (user.getFirstName().length() < 3) {
			System.out.println("First name is invalid");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("This field cannot be left blank.");
			return false;
		} else if (user.getLastName().length() < 3) {
			System.out.println("Last name is invalid");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkEmail(User user) {

		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println("This field cannot be left blank. ");
			return false;
		} else {
			if (pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("Given email format is not valid. Example : example@gmail.com");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		} else {
			System.out.println("Password cannot be less than 6 characters");
			return false;
		}

	}

	@Override
	public boolean avaliableEmail(User user) {
		if (!emailList.contains(user.getEmail())) {
			return true;
		} else {
			System.out.println("e-posta adresi sistemde mevcut!");
			return false;
		}
	}

	@Override
	public boolean validUser(User user) {

		if (checkFirstName(user) && checkLastName(user) && checkPassword(user) && avaliableEmail(user)
				&& checkEmail(user) != true) {
			System.out.println("Please check your details");
			return false;
		} else {
			System.out.println("The user succesfully added to the system");
			return true;
		}

	}

}
