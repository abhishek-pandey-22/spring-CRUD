package crudmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import crudmvc.model.User;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//new user
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.save(user);
		
		
	}
	
	//get all users
	public List<User> getUsers(){
		
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		return users;
		
	}

}
