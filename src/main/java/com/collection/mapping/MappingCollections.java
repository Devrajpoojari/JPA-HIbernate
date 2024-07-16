package com.collection.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappingCollections {

	public static void main(String[] args) {

		// step 1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		// step 2
		EntityManager em = emf.createEntityManager();

		// step 3
		em.getTransaction().begin();
		Address add1 = new Address(34, "546262", "Hydrabad");
		Address add2 = new Address(4, "658790", "Banglore");
		List<Address> listd = new ArrayList<Address>(Arrays.asList(add1, add2));

		Employee emp = new Employee(367, "Kumar", 213434.23f, listd);
		
		//2nd employee 
		
		Address add3 = new Address(89, "146262", "Kaashmeer");
		Address add4 = new Address(234, "238790", "Mumbai");
		List<Address> listd2 = new ArrayList<Address>(Arrays.asList(add3, add4));

		Employee emp11 = new Employee(789, "Akash", 34521.23f, listd2);

		em.persist(emp);
		em.persist(emp11);
		
		//find or get employee details
		
		Employee emp1 = em.find(Employee.class, 367);
		System.out.println(emp1);

		em.getTransaction().commit();

	}

}
