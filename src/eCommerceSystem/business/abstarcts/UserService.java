package eCommerceSystem.business.abstarcts;

import java.util.List;

import eCommerceSystem.entity.concretes.User;

public interface UserService {

	void logIn(User user);

	void signUp(User user);

	List<User> getAll();
}
