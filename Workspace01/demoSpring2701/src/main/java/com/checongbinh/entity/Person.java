package com.checongbinh.entity;

public abstract class Person {
	private String name;
	private int age;
	private String address;
	
	public Person() {}
	
	/*
	 * With 3 argument: name, age, address
	 */
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	/*
	 * With 2 argument: name, age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showInformation() {
		System.out.println(this.getName() + " - " + this.getAge() + " - " + this.getAddress());
	}
	
	public void start() {
		System.out.println("method start in Bean");
	}
	
	public void destroy() {
		System.out.println("method destroy in Bean");
	}
	
}
