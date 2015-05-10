package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		CMember member = new CMember();
		System.out.print("사용자 아이디를 입력하세요: ");
//		String userId = scanner.next();		
		member.setUserID("userId");
		
		System.out.print("비밀번호를 입력하세요: ");
//		String password = scanner.next();		
		member.setPassword("password");
		// close scanner
		scanner.close();
		return member;
	}

}
