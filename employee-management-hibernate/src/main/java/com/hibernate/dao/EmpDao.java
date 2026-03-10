package com.hibernate.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import com.hibernate.entity.Employee;

public class EmpDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;
	Scanner sc;
	{
		sc=new Scanner(System.in);
		 emf=Persistence.createEntityManagerFactory("emp");
		 em=emf.createEntityManager();
		 et=em.getTransaction();
	}

	public void delete() {
		System.out.println("enter the emp id");
		Employee emp= em.find(Employee.class, sc.nextLong());
		et.begin();
		if(emp!=null) {
		   System.out.println("data deleted sucessfully...");
		   em.remove(emp);
		}
		else {
			System.out.println("Id not FOund.......");
		}
		et.commit();
	}

	public void fetchById() {
		System.out.println("enter the emp id");
		Employee emp= em.find(Employee.class, sc.nextLong());
//		et.begin();
		if(emp!=null) {
		   System.out.println("Id:"+emp.getId());
		   System.out.println("Name:"+emp.getName());
		   System.out.println("salary:"+emp.getSalary());
		   System.out.println("dept:"+emp.getDept());
		   
		}
		else {
			System.out.println("Id not FOund.......");
		}
//		et.commit();	
	}

	public void update() {
		System.out.println("enter the emp id");
		Employee emp= em.find(Employee.class, sc.nextLong());
		et.begin();
		if(emp!=null) {
		   System.out.println("Enter the updated Name:");
		   emp.setName(sc.next());
		   System.out.println("Enter the updated salary:");
		   emp.setSalary(sc.nextDouble()); 
		   System.out.println("Enter the updated Dept:");
		   emp.setDept(sc.next());
		  em.merge(emp);
		  System.out.println("updated sucessfully............");
		}
		else {
			System.out.println("Id not FOund.......");
		}
		et.commit();	
	}
		


	public void insert() {
		Employee emp=new Employee();
		   System.out.println("Enter the Id:");
		   emp.setId(sc.nextLong());
		  System.out.println("Enter the Name:");
		   emp.setName(sc.next());
		   System.out.println("Enter the Dept:");
		   emp.setDept(sc.next());
		   System.out.println("Enter the salary:");
		   emp.setSalary(sc.nextDouble()); 
		   et.begin();
		   em.persist(emp);
		   et.commit();
		
	}

}
