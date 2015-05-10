package 己利贸府;

public class CMain {

	public static void main(String[] args) {
		// objects creation
		CGwamok gwamok = new CGwamok();
		CGangjwa gangjwa = new CGangjwa();
		
		CGyosu gyosu = new CGyosu();
		CHaksaeng haksaeng = new CHaksaeng();
		
		CSeongjeok seongjeok = new CSeongjeok();
		
		// set associations
		gyosu.setGangjwa(gangjwa);
		gyosu.setGwamok(gwamok);
		gyosu.setSeongjeok(seongjeok);
		
		haksaeng.setSeongjeok(seongjeok);
		
		// 
		seongjeok.ipryeok(45);
		int s = seongjeok.johwe();

		
	}

}
