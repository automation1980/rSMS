package com.sms;
import java.util.ArrayList;
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
}

