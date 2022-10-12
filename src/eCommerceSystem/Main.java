package eCommerceSystem;

import eCommerceSystem.business.abstarcts.UserService;
import eCommerceSystem.business.concretes.UserCheckManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entity.concretes.User;

public class Main {
	
	UserService userService = new UserManager(new UserCheckManager(), new HibernateUserDao());
	
	User user = new User(50, "Ze", "a", "zeynep", "123");
	  
	
	
}
