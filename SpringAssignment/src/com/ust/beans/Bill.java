package com.ust.beans;

public class Bill {
	
	private int billId;
	private int pid;
	private int mid;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int billId, int pid, int mid) {
		super();
		this.billId = billId;
		this.pid = pid;
		this.mid = mid;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", pid=" + pid + ", mid=" + mid + "]";
	}
	
	
	
	

}
