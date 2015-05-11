package main;

import java.io.FileNotFoundException;
import view.CLoginView;
import control.CLoginControl;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;
import DAOs.DBDAO;
import DAOs.IDAO;

public class CMain {

	public static void main(String[] args) throws FileNotFoundException, UserIDNotFoundException, PasswordNotMatchException {
		IDAO dao = new DBDAO();
		// components
		CLoginView loginView = new CLoginView();
		CLoginControl  loginControl = new CLoginControl();
		// association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		// start
		VUser vUser = loginView.login();
	}
}
