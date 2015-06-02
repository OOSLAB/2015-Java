package main;

import java.util.Scanner;

import view.CClassRegistrationView;
import view.CGangjwaCreationView;
import view.CGangjwaEnquiryView;
import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CSeongjeokEnquiryPView;
import view.CSeongjeokEnquirySView;
import view.CSeongjeokInputView;
import view.CStudentView;
import view.CUserRegisterView;
import view.CView.EViewType;
import entity.VUser;
import entity.VUser.EUserType;

public class CMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CMainView mainView = new CMainView();
		CLoginView loginView = new CLoginView();
		CUserRegisterView userRegisterView = new CUserRegisterView();
		CStudentView studentView = new CStudentView();
		CProfessorView professorView = new CProfessorView();
		CGangjwaCreationView gangjwaCreationView = new CGangjwaCreationView();
		CGangjwaEnquiryView gangjwaEnquiryView = new CGangjwaEnquiryView();
		CSeongjeokInputView seongjeokInputView = new CSeongjeokInputView();
		CSeongjeokEnquiryPView seongjeokEnquiryPView = new CSeongjeokEnquiryPView();
		CClassRegistrationView classRegistrationView = new CClassRegistrationView();
		CSeongjeokEnquirySView seongjeokEnquirySView = new CSeongjeokEnquirySView();
		
		mainView.add(studentView);
		mainView.add(professorView);
		mainView.add(userRegisterView);
		studentView.add(classRegistrationView);
		studentView.add(seongjeokEnquirySView);
		professorView.add(gangjwaCreationView);
		professorView.add(gangjwaEnquiryView);
		professorView.add(seongjeokInputView);
		professorView.add(seongjeokEnquiryPView);
		
		EViewType selection = mainView.show(scanner);
		
		while(selection.ordinal() != 0 ) {
			switch (selection) {
			case ELogout:
				System.out.println("·Î±×¾Æ¿ô.");
				break;
			case ELoginView:
				VUser vUser = loginView.login(scanner);
				if (vUser.geteUserType()==EUserType.EProfessor) {
					selection = professorView.show(scanner);
				} else if (vUser.geteUserType()==EUserType.EStudent) {
					selection = studentView.show(scanner);
				}
				break;
			case EUserRegisterView:
				selection = userRegisterView.show(scanner);
				break;
			case EGangjwaCreationView:
				selection = gangjwaCreationView.show(scanner);
				break;
			case EGangjwaEnquiryView:
				selection = gangjwaEnquiryView.show(scanner);
				break;
			case ESeongjeokInputView:
				selection = seongjeokInputView.show(scanner);
				break;
			case ESeongjeokEnquiryPView:
				selection = seongjeokEnquiryPView.show(scanner);
				break;
			case EClassRegistrationView:
				selection = classRegistrationView.show(scanner);
				break;
			case ESeongjeokEnquirySView:
				selection = seongjeokEnquirySView.show(scanner);
				break;
			case EBeforeView:
				break;	
			default:
				break;			
			}
		}		
		scanner.close();
	}
}