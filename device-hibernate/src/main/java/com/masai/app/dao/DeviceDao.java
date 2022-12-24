package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Devices;
public interface DeviceDao {
	public boolean createDevice(Devices device);
	
	public boolean deleteDevice(int no);
	
	public boolean updateDevice(Devices device);

	public Devices findDevice(int no);
	
	public List<Devices> findAllDevices();
}
