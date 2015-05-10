package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView {
	
	public void login()
			throws FileNotFoundException, 
			UserIDNotFoundException, 
			PasswordNotMatchException {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();
//		String userId = scanner.next();		
//		String password = scanner.next();		
		vLogin.setUserID("id5");		
		vLogin.setPassword("pw6");
		VUser vUser = (VUser)
				((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result: "+vUser.getName());


		// close scanner	
		scanner.close();
	}
}
