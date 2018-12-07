package com.sms;
import java.util.*;
import java.util.ArrayList;


public class ObjectManager 
{
	public static int size;
	public static ArrayList<ObjectiveType> ObjTypeList = new ArrayList<ObjectiveType>();
	 
	

	public static void operations() 
	{
		int userinput;
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1: Add");
		System.out.println("Press 2: Read");
		System.out.println("Press 3: Update");
		System.out.println("Press 4: Delete");
		System.out.println("******************************************************************");
		System.out.println("");
		
		userinput = input.nextInt();
		switch(userinput) 
		{
			case 1:
				add();
				break;
		
		}
		
		

	}

	public static void add() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Select your operation: ");
		int operation1 = input.nextInt();

		switch (operation1) 
		{
		case 1:
			operation1 = 1;

			
			
			System.out.println("How many objects would you like to create: ");
			int ques1 = input.nextInt();

			System.out.println("Enter String name?");
			String ques2 = input.next();

			System.out.println("Enter creation date?");
			int ques3 = input.nextInt();

			System.out.println("Enter the update date?");
			int ques4 = input.nextInt();

			System.out.println("Enter active?");
			String ques5 = input.next();

			System.out.println("Enter Creator Name?");
			String ques6 = input.next();

			System.out.println("Enter Attribute list?");
			String ques7 = input.next();

			for (int i = 0; i < ObjTypeList.size(); i++) {
			ObjTypeList.get(i).printBase();
			}

		}
	}
}
