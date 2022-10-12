package eCommerceSystem.business.concretes;

import java.util.List;

import eCommerceSystem.business.abstarcts.UserCheckService;
import eCommerceSystem.business.abstarcts.UserService;
import eCommerceSystem.dataAccess.abstarcts.UserDao;
import eCommerceSystem.entity.concretes.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;
	private UserDao userDao;

	public UserManager(UserCheckService userCheckService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
	}

	@Override
	public void logIn(User user) {
		if (userCheckService.checkEmail(user) && userCheckService.checkPassword(user) == true) {
			System.out.println("Logged in!");
		} else {
			System.out.println("Please enter your email and password!");
		}
		this.userDao.add(user);
		this.userCheckService.validUser(user);
	}

	@Override
	public void signUp(User user) {
		if (userCheckService.validUser(user)) {
			this.userDao.add(user);
			System.out.println("Registered");
		} else {
			System.out.println("Not Registered");
		}
		this.userDao.add(user);
		this.userCheckService.validUser(user);

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
