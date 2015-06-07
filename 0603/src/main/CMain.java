package main;

import java.util.Scanner;

import main.Constant.EEvent;
import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CStudentView;
import view.CView;
import entity.VUser;
import entity.VUser.EUserType;

public class CMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CMainView mainView = new CMainView();
		EEvent selection = mainView.show(scanner);
		
		while(selection != EEvent.eLogout ) {
			CView view = selection.getView();
			selection = view.show(scanner);
		}		
		scanner.close();
	}
}