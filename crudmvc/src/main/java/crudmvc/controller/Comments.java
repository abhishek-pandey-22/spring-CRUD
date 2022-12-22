//package crudmvc.controller;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Comments {
//
//
//	public static void main(String[] args) {
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//		
//		
//
//
//		Session s = factory.openSession();
//
//		Transaction tx = s.beginTransaction();
//
//		// save
//		
//	
//
////		Question q = (Question) s.get(Question.class, 1212);		
////		
////		System.out.println(q.getQuestionId());
////		System.out.println(q.getQuestion());
////		
////		System.out.println(q.getAnswers().size());
//
//	
//		tx.commit();
//
//		// fetching........
////		Question newQ = (Question) s.get(Question.class, 242);
////		System.out.println(newQ.getQuestion());
////		System.out.println(newQ.getAnswer().getAnswer());
//
//		s.close();
//
//		factory.close();
//
//	}
//}
