package com.masai.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.app.dao.DeviceDao;
import com.masai.app.entity.Devices;
import com.masai.app.util.EMUtils;


public class DeviceService implements DeviceDao{
	public boolean createDevice(Devices device) {
		boolean employeeCreated =false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.persist(device);
		employeeCreated = true;
		System.out.println("device created");
		em.getTransaction().commit();
		em.close();
		return employeeCreated;
	}

	public boolean deleteDevice(int no) {
		boolean deviceDeleted = false;
		EntityManager em = EMUtils.provideEntityManager();
		Devices dev = em.find(Devices.class, no);
		if (dev != null) {
			em.getTransaction().begin();
			em.remove(dev);
			deviceDeleted = true;
			System.out.println("Device Deleted");
			em.getTransaction().commit();
			em.close();
		}
		return deviceDeleted;
	}

	public boolean updateDevice(Devices device) {
		boolean deviceUpdated =false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.merge(device);
		deviceUpdated = true;
		System.out.println("Device Updated");
		em.getTransaction().commit();
		em.close();
		return deviceUpdated;
	}

	public Devices findDevice(int no) {
		EntityManager em=EMUtils.provideEntityManager();
		String findDevice="from Devices where id='"+no+"'"; 
		Query query=em.createQuery(findDevice);
		return (Devices) query.getSingleResult();
	}

	public List<Devices> findAllDevices() {
		EntityManager em=EMUtils.provideEntityManager();
		String findDevices="from Devices"; 
		Query query=em.createQuery(findDevices); 
		List<Devices> emp=query.getResultList();
		return emp;
	}

}
