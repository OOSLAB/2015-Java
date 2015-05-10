package 己利贸府;

import view.CExceptionView;
import view.CLoginView;
import view.CSugangView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;
import control.CSugangControl;
import entity.VUser;

public class CMain 
{
	public static void main(String[] args) 
	{
		try
		{
			//components
			CLoginView loginView = new CLoginView();
			CLoginControl loginControl = new CLoginControl();
			IDAO dao = new TextDAO();
			// association
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			// start
			VUser vUser = loginView.login();
			
			//components\
			CSugangView sugangView = new CSugangView();
			CSugangControl sugangControl = new CSugangControl();
			// association
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
			//start
			sugangView.sugangSincheong(vUser);
		}
		catch(Exception e)
		{
			CExceptionView.processException(e);
		}
	}
}
