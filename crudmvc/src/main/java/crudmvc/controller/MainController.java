package crudmvc.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import crudmvc.dao.CommentDao;
import crudmvc.dao.PostDao;
import crudmvc.dao.UserDao;
import crudmvc.model.Comment;
import crudmvc.model.Post;
import crudmvc.model.User;

@Controller
public class MainController {
    @Autowired
	private UserDao userDao;
	@Autowired
	private PostDao postDao;
	
//	@Autowired
//	private CommentDao commentDao;
	

	
	
	
	@RequestMapping("/login")
	public String user(Model m) {
		List<User> users = userDao.getUsers();
		m.addAttribute("user",users);
		return "login";
	}
	
	
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Post> posts = postDao.getProducts();
		m.addAttribute("product",posts);
		//System.out.print(m);
		return "index";
	}
	

	
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		
		return "addProduct";
	}
	@RequestMapping(value="/dashboard" , method = RequestMethod.POST)
	public RedirectView dashboard(@ModelAttribute Post post, HttpServletRequest request) {
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/");
		return re;
		
	}
	
	//new user
	
	@RequestMapping("/doRegister")
	public String login() {
		return "register";
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public RedirectView registerUser(@ModelAttribute User user, HttpServletRequest request) {
		System.out.println(user);
		userDao.createUser(user);
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/login");
		return re;
		
	}
	
	//comments
//	@RequestMapping(value="/comment" , method = RequestMethod.POST)
//	public RedirectView commented(@ModelAttribute Comment user, HttpServletRequest request) {
//		System.out.println(user);
//		commentDao.comment(user);
//		RedirectView re = new RedirectView();
//		re.setUrl(request.getContextPath()+"/");
//		return re;
//		
//	}
	
	//handle add product form
	
	@RequestMapping(value="/handleProduct" , method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Post post, HttpServletRequest request) {
		System.out.println(post);
		postDao.createProduct(post);
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/");
		return re;
		
	}
	
	

	
	//delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		
		this.postDao.deleteProduct(productId);
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/");
		return re;
		
	}
	
	//update handler
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int productId,Model m,HttpServletRequest request) {
		
		Post post = this.postDao.getProduct(productId);
		m.addAttribute("product",post);
		return "updateForm";
		
	}
	

	
	@RequestMapping("/read/{productId}")
	public String readMore(@PathVariable("productId") int productId,Model m,HttpServletRequest request) {
		
		Post post = this.postDao.getProduct(productId);
		m.addAttribute("product",post);
		return "readMore";
		
	}
	
	

	

}
