package 성적처리;

import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGangjwaDAO;
import entity.CGwamok;
import entity.CGwamokDAO;
import entity.CMember;
import entity.CMemberDAO;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;

public class CMain {

	public static void main(String[] args) {
		// login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl  loginControl = new CLoginControl();
		member = loginControl.login(member);
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
		
		// 과목 개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);		
		CGwamokDAO gwamokDAO = new CGwamokDAO();
		gwamokDAO.write(gwamok);
		// 강좌 개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);		
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		gangjwaDAO.write(gangjwa);
		
	}

}
