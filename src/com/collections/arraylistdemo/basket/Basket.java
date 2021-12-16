package com.collections.arraylistdemo.basket;

public class Basket {
	
	private long manufactureNo;
	private int qty;
	
	public Basket(long manufactureNo, int qty) {
		super();
		this.manufactureNo = manufactureNo;
		this.qty = qty;
	}
	
	public long getManufactureNo() {
		return manufactureNo;
	}
	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Basket [manufactureNo=" + manufactureNo + ", qty=" + qty + "]";
	}	

}
