package com.sms;


public class ObjectiveType extends Base {

// common attributes 
	String name;
	int creation_date;
	int updated_date;
	String active;

//uncommon 
	String creator_name;
	String attribute_list;

	public ObjectiveType(String name, int creation_date, int updated_date, String active, String creator_name,
			String attribute_list) {
		
		super(name, creation_date, updated_date, active);
		this.creator_name = creator_name;
		this.attribute_list = attribute_list;

	}

	public void printObjectiveType() {
		
		System.out.println("Name" + "\t" + "Creation_date" + "\t" + "Updated_date" + "\t" + "Active" + "\t"
				+ "creator_name" + "\t" + "attribute_list");
		System.out.println(name + "\t" + "\t" + creation_date + "\t" + "\t" + updated_date + "\t" + active 
				+ "\t" + creator_name + "\t" + attribute_list);

	}
}
