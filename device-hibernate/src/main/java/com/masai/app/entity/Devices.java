package com.masai.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Devices {
	
	@Id
	@GeneratedValue
	private int id;
	private String model,brand,type;
	private float price;
	private String camera_spec,processor_spec,memory_spec,os_sspec,size_spec;
	
	public Devices() {
		
	}

	public Devices(int id, String model, String brand, String type, float price, String camera_spec,
			String processor_spec, String memory_spec, String os_sspec, String size_spec) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.camera_spec = camera_spec;
		this.processor_spec = processor_spec;
		this.memory_spec = memory_spec;
		this.os_sspec = os_sspec;
		this.size_spec = size_spec;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCamera_spec() {
		return camera_spec;
	}

	public void setCamera_spec(String camera_spec) {
		this.camera_spec = camera_spec;
	}

	public String getProcessor_spec() {
		return processor_spec;
	}

	public void setProcessor_spec(String processor_spec) {
		this.processor_spec = processor_spec;
	}

	public String getMemory_spec() {
		return memory_spec;
	}

	public void setMemory_spec(String memory_spec) {
		this.memory_spec = memory_spec;
	}

	public String getOs_sspec() {
		return os_sspec;
	}

	public void setOs_sspec(String os_sspec) {
		this.os_sspec = os_sspec;
	}

	public String getSize_spec() {
		return size_spec;
	}

	public void setSize_spec(String size_spec) {
		this.size_spec = size_spec;
	}

	@Override
	public String toString() {
		return "Devices [id=" + id + ", model=" + model + ", brand=" + brand + ", type=" + type + ", price=" + price
				+ ", camera_spec=" + camera_spec + ", processor_spec=" + processor_spec + ", memory_spec=" + memory_spec
				+ ", os_sspec=" + os_sspec + ", size_spec=" + size_spec + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, camera_spec, id, memory_spec, model, os_sspec, price, processor_spec, size_spec,
				type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devices other = (Devices) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(camera_spec, other.camera_spec) && id == other.id
				&& Objects.equals(memory_spec, other.memory_spec) && Objects.equals(model, other.model)
				&& Objects.equals(os_sspec, other.os_sspec)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(processor_spec, other.processor_spec) && Objects.equals(size_spec, other.size_spec)
				&& Objects.equals(type, other.type);
	}
	
	
}
