package org.demo;

import java.util.ArrayList;

public class Root {
	private String name;
	private int age;
	private boolean ststus;
	private Address address;
	private ArrayList<String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStstus() {
		return ststus;
	}
	public void setStstus(boolean ststus) {
		this.ststus = ststus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

}
