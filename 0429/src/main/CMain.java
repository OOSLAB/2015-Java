package main;

import view.CLoginView;
import view.CSugangView;
import control.CGangjwaControl;
import control.CLoginControl;
import entity.VUser;
import DAOs.IDAO;
import DAOs.TextDAO;
import view.CExceptionView;

public class CMain {

	public static void main(String[] args) {
		try {
			IDAO dao = new TextDAO();
			// components
			CLoginView loginView = new CLoginView();
			CLoginControl  loginControl = new CLoginControl();
			// association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			// start
			VUser vUser = loginView.login();
			
			// components
			CSugangView sugangView = new CSugangView();
			CGangjwaControl sugangControl = new CGangjwaControl();
			// association
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
			// start			
			sugangView.sugangSincheong(vUser);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}

}
