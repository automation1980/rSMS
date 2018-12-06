package com.sms;

import java.util.*;
import java.util.ArrayList;

public class ObjectManager {

	public static void main(String[] args) {
		operations();
		add();
	}

	public static void operations() {
		System.out.println("Press 1: Add");
		System.out.println("Press 2: Read");
		System.out.println("Press 3: Update");
		System.out.println("Press 4: Delete");
		System.out.println("***********************************************************");
		System.out.println("");
	
	}

	public void add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select your operation: ");
		
		int operation1 = input.nextInt();
		switch (operation1) {
		case 1:
			operation1 = 1;
						
			System.out.println("How many objects would you like to create: ");
			int ques1 = input.nextInt();

		
			System.out.println("Enter String name?");
			String ques2 = input.toString();
			
			System.out.println("Enter creation date?");
			int ques3 = input.nextInt();
			
			
			System.out.println("Enter the update date?");
			int ques4 = input.nextInt();
			
			
			System.out.println("Enter active?");
			int ques5 = input.nextInt();
			
			
			System.out.println("Enter Creator Name?");
			int ques6 = input.nextInt();
			
			
			System.out.println("Enter Attribute list?");
			int ques7 = input.nextInt();
			
			//
			
		
		}

	}

}
