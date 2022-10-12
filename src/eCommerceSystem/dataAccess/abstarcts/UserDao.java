package eCommerceSystem.dataAccess.abstarcts;

import java.util.List;

import eCommerceSystem.entity.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll();

}
