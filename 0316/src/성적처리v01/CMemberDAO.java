package 성적처리v01;

public class CMemberDAO {
	public CMember read() { return null; }
	public void write(CMember member) {
		System.out.println("입력하신 내용입니다.");
		System.out.println("아이디: " + member.getUserID());
		System.out.println("비밀번호: " + member.getPassword());
	}
	
}
