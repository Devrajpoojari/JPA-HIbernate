package com.association.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// step 1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		// step 2
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Question q1 = new Question();
		q1.setqId(23435L);
		q1.setQuestion("What is java ? ");

		Answer a1 = new Answer();

		a1.setaId(2121L);
		a1.setAnswer("JAVA is Object Oriented High level Programming platform independent language");
		a1.setQuestion(q1);
		q1.setAnswer(a1);

		em.persist(q1);
		
		Question q11 = em.find(Question.class, 23435L);
		System.out.println(q11);
		
		Answer answer =em.find(Answer.class, 2121L);
		System.out.println(answer);
		System.out.println("Question id =" +answer.getaId()+"Question = "+answer.getAnswer());
		
		q1.setQuestion("What is python?");
		
//		em.remove(q11);
		
		em.getTransaction().commit();

	}

}
