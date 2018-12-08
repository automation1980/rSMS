package com.sms;

import java.util.ArrayList;

public class ObjectiveType extends Base {

	public static ArrayList<ObjectiveType> ObjTypeList = new ArrayList<ObjectiveType>();

//uncommon 
	String creator_name;
	String attribute_list;

	public ObjectiveType(String name, int creation_date, int updated_date, String active, String creator_name,
			String attribute_list) {
		
		super(name, creation_date, updated_date, active);
		this.creator_name = creator_name;
		this.attribute_list = attribute_list;

	}
//print method
	public void printObjectiveType() {
		
		
		System.out.println(name + "\t" + "\t" + creation_date + "\t" + "\t" + updated_date + "\t" + active + "\t" 
				+ "\t" + creator_name + "\t" + "\t" + attribute_list);

	}
}
