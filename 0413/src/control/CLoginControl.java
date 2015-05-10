package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CLoginControl extends CControl {
	public VUser login(VLogin vLogin) {
		// TODO Auto-generated method stub
		VUser vUser = new VUser();
		CUser user = new CUser();
		try {
			this.getDao().connect("member1.txt");
			while (this.getDao().hasNext()) {
				user = (CUser)this.getDao().read(user);
				if (user.getUserID().equals(vLogin.getUserID())) {
					if (user.getPassword().equals(vLogin.getPassword())) {
						vUser.seteLoginResult(ELoginResult.succees);
						vUser.setName(user.getName());
						vUser.setUserID(user.getUserID());
					} else {
						vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			this.getDao().disconnect();
			vUser.seteLoginResult(ELoginResult.idError);
			return vUser;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;		
		}
	}
}
