package com.checongbinh.entity;

public class GiaoVien extends Person{
	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}
	
	public GiaoVien(String name, int age, String address) {
		super(name, age, address);
	}
	
	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		super.showInformation();
		System.out.println("Method showInformation from class GiaoVien");
	}
}
