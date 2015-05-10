package main;

import java.io.FileNotFoundException;

import view.CExceptionView;
import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CMain {

	public static void main(String[] args) {
		try {
			CLoginView loginView = new CLoginView();
			CLoginControl  loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
			// association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			loginView.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}

}
