package view;

import java.util.Scanner;

import entity.VLogin;
import entity.VUser;
import entity.VUser.EUserType;

public class CLoginView extends CView {
	
	public VUser login(Scanner scanner) {
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();
		System.out.print("아이디입력: ");
		String userId = scanner.next();		
		System.out.print("비밀번호입력: ");
		String password = scanner.next();		
		vLogin.setUserID(userId);		
		vLogin.setPassword(password);
		
		VUser vUser = new VUser();
		// vUser = control.login(vLogin);
		vUser.setName(userId);
		vUser.setUserID(userId);
		vUser.seteUserType(EUserType.EProfessor);
		System.out.println("로그인되었습니다.");
		return vUser;
	}

	@Override
	public int show(Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}
}
