package eCommerceSystem.business.abstarcts;

import eCommerceSystem.entity.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);

	boolean checkLastName(User user);

	boolean checkEmail(User user);

	boolean checkPassword(User user);

	boolean avaliableEmail(User user);
	
	boolean validUser(User user);
}
