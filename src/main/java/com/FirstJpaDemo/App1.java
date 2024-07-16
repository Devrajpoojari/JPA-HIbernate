package com.FirstJpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println("Connected");
		
		Laptop l1=new Laptop();
		l1.setLname("Macbook");
		l1.setCompany("Apple");
		
		Laptop l2=new Laptop();
		l2.setLname("ElightBook");
		l2.setCompany("HP");
	
		  Student s1=new Student(); 
		  //s1.setSid(101); 
		  s1.setSname("Pia");
		  s1.setTech("Java"); 
		  s1.setLaptop(l1);
		   em.persist(s1);
		   
		   l1.setStudent(s1);
		   //em.persist(l1);
		  
		  Student s2=new Student(); 
		  //s2.setSid(102); 
		  s2.setSname("Sia");
		  s2.setTech("JavaFS");
		  s2.setLaptop(l2);
		 em.persist(s2);
		 l2.setStudent(s2);
		  // em.persist(l2);
//		 s2.setSname("Devraj");
		 
		 em.getTransaction().commit();

	}

}
