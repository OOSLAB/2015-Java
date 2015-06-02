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
				System.out.println("로그아웃.");
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
				System.out.println("학생화면.");
				break;
			case 3:
				System.out.println("강좌개설.");
				selection = 1;
				break;
			case 4:
				System.out.println("강좌조회.");
				break;
			case 5:
				System.out.println("성적입력.");
				break;
			case 6:
				System.out.println("성적조회.");
				break;
			default:
				break;			
			}
		}		
		scanner.close();
	}
}