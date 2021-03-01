package com.checongbinh.entity;

public class GiamDoc extends NhanVien{
	private String chucVu;

	public GiamDoc() {
	}
	
	public GiamDoc(String name, int age, String address) {
		super(name, age, address);
	}
	public GiamDoc(String chucVu, String name, int age, String address) {
		super(name, age, address);
		this.chucVu = chucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - chuc vu: "+ this.getChucVu();
	}
}
