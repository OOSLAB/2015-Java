package entity;


public class CMemberDAO {
	// Data Access Object: Read or write data from persistent storage
	public CMember read() { return null; }
	public void write(CMember member) {
		System.out.println("�����ID: " + member.getUserID());
		System.out.println(",��й�ȣ: " + member.getPassword());
	};

}
