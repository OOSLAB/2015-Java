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
		CView view = (CMainView) EEvent.eMain.getView();
		EEvent selection = view.show(scanner);
		
		EEvent.eProfessor.setPreView(view);
		EEvent.eStudent.setPreView(view);
		EEvent.eSignUp.setPreView(view);
		EEvent.eReturn.setPreView(view);
		
		view = EEvent.eProfessor.getView();
		EEvent.eCreateClass.setPreView(view);
		EEvent.eGetClass.setPreView(view);
		EEvent.eSetGrade.setPreView(view);
		EEvent.eGetGradeP.setPreView(view);
		
		view = EEvent.eStudent.getView();
		EEvent.eRegisterClass.setPreView(view);
		EEvent.eGetGradeS.setPreView(view);
		

		EEvent temp = null;
		while(selection!=EEvent.eLogout){
			if(selection==EEvent.eReturn){
				view = temp.getPreView();
				temp = view.show(scanner);
				selection = temp;
			}else {
				temp = selection;
				view = selection.getView();
				selection = view.show(scanner);
			}
		}	
		
		scanner.close();
	}
}