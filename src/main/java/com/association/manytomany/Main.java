package com.association.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee e1=new Employee();
		e1.setEmployeeId(23);
		e1.setEmployeeName("Pooja");
		
		Employee e2=new Employee();
		
		e2.setEmployeeId(34);
		e2.setEmployeeName("Akasha");
		
		List<Employee> listOfEmp=Arrays.asList(e1,e2);
		//------------------------------------------------------------
		Project p1=new Project();
		
		p1.setProjectId(21);
		p1.setProjectName("LMS");
		
		//setting employee list in project 
		p1.setEmployees(listOfEmp);
		
		Project p2=new Project();
		
		p2.setProjectId(10);
		p2.setProjectName("FMS");
		p2.setEmployees(listOfEmp);
		
		List<Project> listOfProject =Arrays.asList(p1,p2);
		
		e1.setProjects(listOfProject);
		e2.setProjects(listOfProject);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(p1);
		em.persist(p2);
		
		em.getTransaction().commit();
	}

}
