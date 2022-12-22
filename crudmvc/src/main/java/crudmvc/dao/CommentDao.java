package crudmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import crudmvc.model.Comment;



public class CommentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//create product
	@Transactional
	public void comment(Comment user) {
		this.hibernateTemplate.save(user);
		
		
	}
	
	//get all products
	public List<Comment> getComments(){
		
		List<Comment> users = this.hibernateTemplate.loadAll(Comment.class);
		return users;
		
	}

}
