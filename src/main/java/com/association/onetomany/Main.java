package com.association.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Instructor i1 = new Instructor();
		i1.setiID(UUID.randomUUID().toString());
		i1.setiName("Nagraj");
		i1.setpNumber(9900123123L);

		List<Course> courseList1 = new ArrayList<Course>(
				Arrays.asList(new Course(UUID.randomUUID().toString(), "Java fullstack", "6 months",i1),
						new Course(UUID.randomUUID().toString(), "Python fullstack", "6 months",i1),
						new Course(UUID.randomUUID().toString(), " Dijango", "4 months",i1),
						new Course(UUID.randomUUID().toString(), ".net fullstack", "6 months",i1)));

		i1.setCourses(courseList1);

		em.persist(i1);

//		Instructor instructor1 = em.find(Instructor.class, "c9b4c3d4-2b01-48b5-be17-c9d5dbe32faf");
//		System.out.println(instructor1);
//		
//		List<Course> list=instructor1.getCourses();
		
//		list.forEach(System.out::println);
		
		Course c1=em.find(Course.class, "26cced8d-b5f7-484d-987a-0d603f3b2dea");
		System.out.println(c1);
		System.out.println(c1.getInstructor().getiName());
		
		em.remove(c1);

		em.getTransaction().commit();
		

	}

}
