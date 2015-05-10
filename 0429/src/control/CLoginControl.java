package control;

import java.io.IOException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginControl extends CControl {
	public VUser login(VLogin vLogin) 
			throws UserIDNotFoundException, 
					PasswordNotMatchException, IOException {
		// TODO Auto-generated method stub
		VUser vUser = new VUser();
		CUser user = new CUser();
		this.getDao().connect("member.txt", "r");
		user = (CUser)this.getDao().read(user, vLogin.getUserID());
		this.getDao().disconnect();
		
		if (user==null) 
			throw new UserIDNotFoundException();
		if (!user.getPassword().equals(vLogin.getPassword())) 
			throw new PasswordNotMatchException();
		
		vUser.setName(user.getName());
		vUser.setUserID(user.getID());
		return vUser;
	}
}
