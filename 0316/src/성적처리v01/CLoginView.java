package 성적처리v01;

import java.util.Scanner;

public class CLoginView {
	
	public CMember login() {
		// TODO Auto-generated method stub
		CMember member = new CMember();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("아이디를 입력하세요: ");
		member.setUserID(keyboard.next());
		System.out.println("비밀번호를 입력하세요: ");
		member.setPassword(keyboard.next());
		return member;
	}

}
