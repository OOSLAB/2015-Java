package ����ó��v01;

public class CMemberDAO {
	public CMember read() { return null; }
	public void write(CMember member) {
		System.out.println("�Է��Ͻ� �����Դϴ�.");
		System.out.println("���̵�: " + member.getUserID());
		System.out.println("��й�ȣ: " + member.getPassword());
	}
	
}
