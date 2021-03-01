package com.checongbinh.entity;

import java.util.Map;
import java.util.Properties;

public class NhanVien extends Person{
	private GiamDoc giamdoc;


	public NhanVien() {
	}
	
	public NhanVien(String name, int age, String address) {
		super(name, age, address);
		
	}
	public NhanVien(GiamDoc giamdoc) {
		this.giamdoc = giamdoc;
	}
	
	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println("method showInformation from class NhanVien");
	}
	
	public NhanVien createNhanVien() {
		NhanVien nhanvien = new NhanVien();
		nhanvien.setName("Khong Thi Thu Trang");
		nhanvien.setAddress("Thai Binh - Viet Nam");
		nhanvien.setAge(18);
		return nhanvien;
	}

	public GiamDoc getGiamdoc() {
		return giamdoc;
	}

	public void setGiamdoc(GiamDoc giamdoc) {
		this.giamdoc = giamdoc;
	}
	
	@Override
	public String toString() {
		return this.getName() + " - " + this.getAge() + " - " + this.getAddress();
	}
}
