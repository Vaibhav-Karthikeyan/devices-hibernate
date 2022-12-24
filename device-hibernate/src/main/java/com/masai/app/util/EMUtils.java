package com.masai.app.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;
public class EMUtils {
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("device");
	}
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
