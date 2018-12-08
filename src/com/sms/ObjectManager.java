package com.sms;
import java.util.*;
public class ObjectManager 
{
	public static int size;
	public static ArrayList<ObjectiveType> ObjTypeList = new ArrayList<ObjectiveType>();
	public static Scanner input = new Scanner(System.in);
	

	public static void operations() 
	{
		int userinput;
		
		System.out.println("");
		System.out.println("Select your operation: ");
		System.out.println("Press 1: Add");
		System.out.println("Press 2: Read");
		System.out.println("Press 3: Update");
		System.out.println("Press 4: Delete");
		System.out.println("Press 5: Exit");
		System.out.println("******************************************************************");
		userinput = input.nextInt();
		
		switch(userinput) 
		{
			case 1:
				add();
				break;			
			case 2: 
				read();
				break;
			case 3:
				update();
				break;
			case 5:
				System.out.println("Program ended, bye!!!");
				input.close();
				break;
		}
	}

	public static void add() 
	{
		System.out.println("How many objects would you like to create: ");
		int index = input.nextInt();
	
		for (int j = 0; j < index; j++)
		{
			System.out.println("Enter data for Objective Type at index: " + (j+1));
			
			System.out.println("Enter String name: ");
			String name = input.next();

			System.out.println("Enter creation date: ");
			int createDate = input.nextInt();

			System.out.println("Enter the update date: ");
			int updateDate = input.nextInt();

			System.out.println("Enter active: ");
			String active = input.next();

			System.out.println("Enter Creator Name: ");
			String creatorName = input.next();

			System.out.println("Enter Attribute list: ");
			String attList = input.next();
			
			ObjectiveType obj = new ObjectiveType(name, createDate, updateDate, active, creatorName, attList);
			ObjTypeList.add(j, obj);
		}
		
		if(index>0)
		{
			System.out.println("Name" + "\t" + "Creation_date" + "\t" + "Updated_date" + "\t" + "Active" + "\t"
					+ "creator_name" + "\t" + "attribute_list");
			for (int i = 0; i < index; i++) 
			{
				ObjTypeList.get(i).printObjectiveType();
			}
		}
		operations();
	}

	public static void read() {
		System.out.println("what index would you like to print out: ");
		int readindex = input.nextInt();

		for (int g = 0; g < readindex; g++) {
			System.out.println("Name" + "\t" + "Creation_date" + "\t" + "Updated_date" + "\t" + "Active" + "\t"
					+ "Creator_name" + "\t" + "Attribute_list");
			ObjTypeList.get(g).printObjectiveType();

		}
		operations();
	}
	
	public static void update() 
	{
	
		System.out.println("What index would you like to update: ");
		int readindex = input.nextInt();
		System.out.println("Name" + "\t" + "Creation_date" + "\t" + "Updated_date" + "\t" + "Active" + "\t"
				+ "Creator_name" + "\t" + "Attribute_list");
			
		switch (readindex) {
		case 0:			
			ObjTypeList.get(0).printObjectiveType();
			System.out.println("What element would you like to change: ");
			int element = input.nextInt();			
		break;
		
		
		case 1:			
			ObjTypeList.get(1).printObjectiveType();	
			System.out.println("What element would you like to change: ");
		 	int element1 = input.nextInt();		 	
		 
	 	break;
	 	
		}
		operations();
	}

}

