package main;

import view.CCreateClassView;
import view.CGetClassView;
import view.CGetGradeSView;
import view.CGetGradePView;
import view.CLoginView;
import view.CMainView;
import view.CSignUpView;
import view.CProfessorView;
import view.CRegisterClassView;
import view.CSetGradeView;
import view.CStudentView;
import view.CView;

public class Constant {
	public enum EEvent {
		
		eLogout(null),
		eSignIn(new CLoginView()),
		eSignUp(new CSignUpView()),
		eCreateClass(new CCreateClassView()), 
		eGetClass(new CGetClassView()),
		eSetGrade(new CSetGradeView()),
		eGetGradeP(new CGetGradePView()),
		eRegisterClass(new CRegisterClassView()),
		eGetGradeS(new CGetGradeSView()),
		eReturn(null),
		eMain(new CMainView()),
		eProfessor(new CProfessorView()),
		eStudent(new CStudentView());
		
		private CView view;
		private CView preView;
		public CView getView() { return view; }
		public CView getPreView() { return preView; }
		public void setPreView(CView preView) { this.preView = preView; }
		
		private EEvent(CView view) {
			this.view = view;
		}
	}
}
