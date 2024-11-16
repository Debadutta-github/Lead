package com.qsp.oops;

public class Flat {
	
	int bill;
	String add;
	private int roomno;
	public Flat(int bill, String add, int roomno) {
	
		this.bill = bill;
		this.add = add;
		this.roomno = roomno;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public void BTM()
	{
		System.out.println("Room Changed");
	}
	

	

}
