package com.codingdojo.phoneproject;

public class PhoneTester {
	
	public static void main(String[] args) {
		IPhone iPhone11 = new IPhone("Pro Max", 100, "Verizon", "iPhone opening(Trap Remix)");
		Galaxy samsungNote = new Galaxy("Note 10", 100, "Verizon", "Open bottle");
		
		
		iPhone11.displayInfo();
		System.out.println(iPhone11.ring());
		samsungNote.displayInfo();
		System.out.println(samsungNote.ring());
		System.out.println(samsungNote.unlock());
		System.out.println(iPhone11.unlock());
	}
}
