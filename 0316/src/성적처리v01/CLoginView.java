package ����ó��v01;

import java.util.Scanner;

public class CLoginView {
	
	public CMember login() {
		// TODO Auto-generated method stub
		CMember member = new CMember();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���: ");
		member.setUserID(keyboard.next());
		System.out.println("��й�ȣ�� �Է��ϼ���: ");
		member.setPassword(keyboard.next());
		return member;
	}

}
