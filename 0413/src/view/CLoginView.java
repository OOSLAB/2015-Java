package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView {
	
	public void login() {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();
//		String userId = scanner.next();		
		vLogin.setUserID("id5");
		
//		String password = scanner.next();		
		vLogin.setPassword("pw5");
		// close scanner
		
		VUser vUser = (VUser) 
				((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result: "+vUser.geteLoginResult().toString());
		scanner.close();
	}
}
