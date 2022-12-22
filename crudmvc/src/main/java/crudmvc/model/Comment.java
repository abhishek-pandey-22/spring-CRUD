package crudmvc.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity(name="Comment_Table")
public class Comment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="comment_id")
	private int c_id;
	private String comments;
	
	//@OneToOne	
	private Post posts;
	
	public Comment(int c_id, String comments, Post posts) {
		super();
		this.c_id = c_id;
		this.comments = comments;
		this.posts = posts;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Post getPosts() {
		return posts;
	}

	public void setPosts(Post posts) {
		this.posts = posts;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

		
}
