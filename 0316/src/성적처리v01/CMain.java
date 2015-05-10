package 己利贸府v01;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		
		
		CLoginControl  loginControl = new CLoginControl();
		member = loginControl.login(member);
		
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
	}
}
