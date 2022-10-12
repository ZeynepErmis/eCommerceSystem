package eCommerceSystem.dataAccess.concretes;

import java.util.List;

import eCommerceSystem.dataAccess.abstarcts.UserDao;
import eCommerceSystem.entity.concretes.User;

public class HibernateUserDao implements UserDao {

	public void add(User user) {
		System.out.println("User added to the system : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted to the system : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("User updated to the system : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
