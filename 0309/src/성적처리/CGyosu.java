package 己利贸府;

public class CGyosu extends CHwewon {
	// attributes
	private String name;
	private String juminbeonho;
	
	// associations
	private CSeongjeok seongjeok;
	private CGwamok gwamok;
	private CGangjwa gangjwa;
	
	public CSeongjeok getSeongjeok() {return seongjeok;}
	public void setSeongjeok(CSeongjeok seongjeok) {this.seongjeok = seongjeok;}
	public CGwamok getGwamok() {return gwamok;}
	public void setGwamok(CGwamok gwamok) {this.gwamok = gwamok;}
	public CGangjwa getGangjwa() {return gangjwa;}
	public void setGangjwa(CGangjwa gangjwa) {this.gangjwa = gangjwa;}

}
