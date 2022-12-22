package crudmvc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Blog")
public class Post {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String description;
	private String tag;
    private String comment;
    
   // @OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	//private List<Comment> comment_demo;
//	@OneToOne
//	private Comment comment_demo;
	

	
	public Post(int id, String name, String description, String tag, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tag = tag;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public long getPrice() {
//		return price;
//	}
//	public void setPrice(long price) {
//		this.price = price;
//	}
//	public Post(int id, String name, String description, long price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.description = description;
//		this.price = price;
//	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", description=" + description +  "]";
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
