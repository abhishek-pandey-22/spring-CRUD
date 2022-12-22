package crudmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crudmvc.model.Post;

@Component
public class PostDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//create product
	@Transactional
	public void createProduct(Post post) {
		this.hibernateTemplate.save(post);
		
		
	}
	
	@Transactional
	public void comment(String comment) {
		this.hibernateTemplate.save(comment);
		
		
	}
	
	//get all products
	public List<Post> getProducts(){
		
		List<Post> posts = this.hibernateTemplate.loadAll(Post.class);
		return posts;
		
	}
	
	//delete single product
	@Transactional
	public void deleteProduct(int pid) {
		Post p = this.hibernateTemplate.load(Post.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	
	//get single product
	
	public Post getProduct(int pid) {
		return this.hibernateTemplate.get(Post.class, pid);
	}

}
