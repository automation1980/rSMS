package com.sms;

public class Base{

	String name;
	int creation_date;
	int updated_date;
	String active;

	public Base(String name, int creation_date, int updated_date, String active) {
		this.name = name;
		this.creation_date = creation_date;
		this.updated_date = updated_date;
		this.active = active;
	}

	public void printBase() {

		System.out.println("Name" + "\t" + "Creation_date" + "\t" + "Updated_date" + "\t" + "Active");
		System.out.println(name + "\t" + "\t" + +creation_date + "\t" + "\t" + updated_date + "\t" + active);

	}
}
