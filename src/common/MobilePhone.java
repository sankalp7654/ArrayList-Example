package common;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	private static ArrayList<Contacts> contactList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
	
	public static void add() {
		System.out.print("Enter the Phone Number: ");
		int phoneNumber = scanner.nextInt();
		
		System.out.print("Enter the Name: ");
		String name = scanner.next();
		
		contactList.add(new Contacts(phoneNumber, name));
		System.out.println("Added Successfully!");
	}
	
	public static void print() {
		int position = 0;
		if(contactList.size() > 0) {
			System.out.println("Contacts in your contact list: ");
			for(Contacts contacts : contactList) {
				System.out.println((++ position) + ". " + contacts);				
			}
		}
		else {
			System.out.println("No Record Found!");
		}
	}
	
	public static void search() {
		System.out.println("Enter the Name to be searched: ");
		String name = scanner.next();
		boolean flag = false;
		
		for(int position = 0; position < contactList.size(); position++) {

			if(name.equals((contactList.get(position).name))) {
				System.out.println("Record Found! ");
				System.out.println((position + 1) + ". " + contactList.get(position));				
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("Not Found!");
		}
		
	}
	
	public static void remove() {
		System.out.println("Enter the Name to be removed: ");
		String name = scanner.next();
		boolean flag = false;
		
		for(int position = 0; position < contactList.size(); position++) {

			if(name.equals((contactList.get(position).name))) {
				contactList.remove(position);
				System.out.println("Record removed! ");
				flag = true;
				print();
			}
			
		}
		if(!flag) {
			System.out.println("Not Found!");
		}
		
	}

	public static void modify() {
		System.out.println("Enter the Name of contact to be modified: ");
		String name = scanner.next();
		boolean flag = false;
		
		for(int position = 0; position < contactList.size(); position++) {

			if(name.equals((contactList.get(position).name))) {
				contactList.remove(position);
				System.out.println("Enter the new Phone Number: ");
				int phoneNumber = scanner.nextInt();
				
				System.out.println("Enter the new Name:");
				name = scanner.next();
				
				contactList.add(position, new Contacts(phoneNumber, name));
				System.out.println("Record Modified! ");
				flag = true;
				print();
			}
			
		}
		if(!flag) {
			System.out.println("Not Found!");
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Press");
		System.out.println("\t1 Add New Contact");
		System.out.println("\t2 Update Existing Contact");
		System.out.println("\t3 Remove Contact");
		System.out.println("\t4 Print Contacts");
		System.out.println("\t5 Search Contact");
		System.out.println("\t6 Quit");
	
	for( ; ; ) {
	
		System.out.println("\nEnter your choice");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			add();
			break;

		case 2:
			modify();
			break;
			
		case 3:
			remove();
			break;
			
		case 4:
			print();
			break;
			
		case 5:
			search();
			break;
			
		default:
			System.out.println("\nWrong Choice!");
			System.exit(0);
		}
	}

	}
		
}
