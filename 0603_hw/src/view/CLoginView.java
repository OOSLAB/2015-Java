package view;

import java.util.Scanner;

import main.Constant.EEvent;
import entity.VLogin;
import entity.VUser;
import entity.VUser.EUserType;

public class CLoginView extends CView {
	
	public EEvent show(Scanner scanner) {
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();
		System.out.print("���̵��Է�: ");
		String userId = scanner.next();		
		System.out.print("��й�ȣ�Է�: ");
		String password = scanner.next();		
		vLogin.setUserID(userId);		
		vLogin.setPassword(password);
		
		VUser vUser = new VUser();
		// vUser = control.login(vLogin);
		vUser.setName(userId);
		vUser.setUserID(userId);
		vUser.seteUserType(EUserType.EProfessor);
		System.out.println("�α��εǾ����ϴ�.");
		EEvent selection;
		if (vUser.geteUserType()==EUserType.EProfessor) {
			selection = EEvent.eProfessor;
		} else {
			selection = EEvent.eStudent;
		}
		return selection;
	}
}
