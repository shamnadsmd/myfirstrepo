package com.ust.beans;

public class Medicine {
	
	private int mid;
	private String mname;
	private double price;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(int mid, String mname, double price) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname
				+ ", price=" + price + "]";
	}
	
	

}
