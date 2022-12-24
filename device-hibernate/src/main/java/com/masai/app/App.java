package com.masai.app;

import java.util.List;

import com.masai.app.dao.DeviceDao;
import com.masai.app.entity.Devices;
import com.masai.app.service.DeviceService;

public class App {

	public static void main(String[] args) {
		DeviceDao dao = new DeviceService();
		Devices device=new Devices(2,"pavillion","hp","laptops",(float) 70000.00,"hd","i5 10th gen","8 gb ram","Windows 10","1 tb");
		dao.updateDevice(device);
		System.out.println(dao.findDevice(1));
		List<Devices> d=dao.findAllDevices();
		for(Devices i:d) {
			System.out.println(i);
		}

	}

}
