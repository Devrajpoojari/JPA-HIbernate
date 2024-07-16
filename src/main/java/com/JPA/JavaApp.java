package com.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JavaApp {

	public static void main(String[] args) {
		// step 1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		// step 2
		EntityManager em = emf.createEntityManager();

		// step 3
		em.getTransaction().begin();

		// step 4

		Employee emp1 = new Employee(0, "Sai ", 3445.790f); // transient state
		Employee emp2 = new Employee(0, "Kiran ", 3445.790f);
		Employee emp3 = new Employee(0, "Devraj ", 3445.790f);
		Employee emp4 = new Employee(0, "Pooja", 3445.790f);

		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);

//		emp1.setEmployeeName("Kajal");
//		emp1.setSalary(100000.0f);
//
//		System.out.println("---------------------------Getting data from database------------------");
//
//		Employee employeeDatafromDB = em.find(Employee.class, 23);
//		System.out.println(employeeDatafromDB);
////		em.detach(emp4);
////		em.merge(emp4);
//		em.remove(emp4);

		System.out.println("-------------------------JPQL-----------------------------------------");
		// get all data from Employee Table 
//		Query q1 = em.createQuery("select e from Employee e");
//		List<Employee> resultList = q1.getResultList();
//		resultList.forEach(System.out::println);

//		// get object by name
		Query q2 = em.createQuery("select e from Employee e where e.employeeName='Pooja'");
		Object singleResult = (Employee) q2.getSingleResult();
		System.out.println(singleResult);
//		
//		// update
//		Query q3 = em.createQuery("update Employee e set e.employeeName='Devraj' where e.employeeName='Sai'");
//		int executeUpdate = q3.executeUpdate();
//		System.out.println(executeUpdate+" Employee Updated");
//		
		//delete
		Query q4= em.createQuery("delete from Employee e where e.employeeName='Devraj'");
		int executeUpdate = q4.executeUpdate();
		System.out.println(executeUpdate);
	
		em.getTransaction().commit();

	}

}
