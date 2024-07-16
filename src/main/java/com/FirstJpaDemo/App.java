package com.FirstJpaDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); // jpa
		EntityManager em = emf.createEntityManager(); // jpa
		em.getTransaction().begin();
		System.out.println("Connected");

		Student s1 = new Student();
		// s1.setSid(101);
		s1.setSname("Pia");
		s1.setTech("Java");
		em.persist(s1);
//		  
		Student s2 = new Student();
		// s2.setSid(102);
		s2.setSname("Sia");
		s2.setTech("JavaFS");
		em.persist(s2);
//		  
//		  Student s3=em.find(Student.class, 2);
//		  System.out.println(s3);
//	     em.detach(s3);
//		  
//		  s3.setSname("Nia");
//		  s3.setTech("Python"); 
//		  em.persist(s3);
//		  System.out.println(s3); 
//		  em.merge(s3);
//		  //Persist will not work when object is detached
//		 // em.persist(s3);
//		         
//		/*
//		 * Student s4=em.find(Student.class, 4); em.remove(s4);
//		 * System.out.println("Deleted");
//		 */
//
//		Query q1 = em.createQuery("Select s from Student s");
//
//		List<Student> ls = q1.getResultList();
//
//		for (Student s : ls) {
//			System.out.println(s);
//			System.out.println(s.getSname() + "  " + s.getTech());
//		}

//         int i=q1.getFirstResult();
//         System.out.println(i);

		Query q2 = em.createQuery("Select s from Student s where s.sname='Sia' ");
		Student ss1 = (Student) q2.getSingleResult();
		System.out.println(ss1);
//         
		Query q3 = em.createQuery("update Student s  set s.sname='Nia' where s.sname='Sia' ");
		int i = q3.executeUpdate();
		System.out.println(i + "  Records Updated");

//        Query q4=em.createQuery("delete from Student s where s.sname='Pia' ");
//        int j=q4.executeUpdate();
//        System.out.println(j+"  Records Deleted");

		// it willnot work
		// Query q5=em.createQuery("create table Student66(sid int,sname varchar2(20))
		// ");
		// int k=q5.executeUpdate();
		// System.out.println(j+" Records Deleted");

//        TypedQuery<Student> tq=(TypedQuery<Student>) em.createQuery("select s from  Student s where tech='PHP' ");
//        Student s3=tq.getSingleResult();
//        System.out.println(s3);
//        
//        TypedQuery<Student> nq=  em.createNamedQuery("MyQuery",Student.class);
//       List<Student> l=  nq.getResultList();

		// System.out.println(l);
		em.getTransaction().commit();
	}
}
