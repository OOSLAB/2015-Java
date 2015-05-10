package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		CMember member = new CMember();
//		String userId = scanner.next();		
		member.setUserID("userId");
		
//		String password = scanner.next();		
		member.setPassword("password");
		// close scanner
		scanner.close();
		return member;
	}

}
