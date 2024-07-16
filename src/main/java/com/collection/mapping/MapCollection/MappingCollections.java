package com.collection.mapping.MapCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<Integer, Address> map1 = new HashMap<Integer, Address>();
		map1.put(4, add1);
		map1.put(3, add2);

		Employee emp = new Employee(367, "Kumar", 213434.23f, map1);

		// 2nd employee

//		Address add3 = new Address(89, "146262", "Kaashmeer");
//		Address add4 = new Address(234, "238790", "Mumbai");
//		List<Address> listd2 = new ArrayList<Address>(Arrays.asList(add3, add4));
//
//		Employee emp2 = new Employee(789, "Akash", 34521.23f, listd2);

		em.persist(emp);
//		em.persist(emp2);

		em.getTransaction().commit();

	}

}
