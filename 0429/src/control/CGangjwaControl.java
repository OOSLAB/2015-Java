package control;

import java.io.IOException;
import java.util.Vector;

import entity.CGangjwa;
import entity.CSugang;

public class CGangjwaControl extends CControl {

	public Vector<CGangjwa> getGangjwaList() throws IOException {
		// read entity list
		Vector<CGangjwa> gangjwaList =  new Vector<CGangjwa>();
		this.getDao().connect("gangjwa.txt", "r");
		while (this.getDao().hasNext()) {
			CGangjwa gangjwa = new CGangjwa();
			gangjwa = (CGangjwa)this.getDao().readNext(gangjwa);
			gangjwaList.add(gangjwa);
		}
		this.getDao().disconnect();
		return gangjwaList;
	}

	public void sugangSincheong(CSugang sugang) throws IOException {
		// TODO Auto-generated method stub
		this.getDao().connect("sugang.txt", "w+");
		this.getDao().write(sugang);
		this.getDao().disconnect();
		
	}

}
