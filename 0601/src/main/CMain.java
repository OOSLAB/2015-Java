package main;

import java.util.Scanner;

import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import entity.VUser;
import entity.VUser.EUserType;

public class CMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CMainView mainView = new CMainView();
		int selection = mainView.show(scanner);
		
		while(selection != 0 ) {
			switch (selection) {
			case 0:
				System.out.println("�α׾ƿ�.");
				break;
			case 1:
				CLoginView loginView = new CLoginView();
				VUser vUser = loginView.login(scanner);
				if (vUser.geteUserType()==EUserType.EProfessor) {
					CProfessorView professorView = new CProfessorView();
					selection = professorView.show(scanner);
				}
				break;
			case 2:
				System.out.println("�л�ȭ��.");
				break;
			case 3:
				System.out.println("���°���.");
				selection = 1;
				break;
			case 4:
				System.out.println("������ȸ.");
				break;
			case 5:
				System.out.println("�����Է�.");
				break;
			case 6:
				System.out.println("������ȸ.");
				break;
			default:
				break;			
			}
		}		
		scanner.close();
	}
}