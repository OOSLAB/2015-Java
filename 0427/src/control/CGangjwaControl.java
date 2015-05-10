package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import DAOs.IDAO;
import entity.CEntity;
import entity.CGangjwa;
import entity.CSugang;
import entity.CUser;

public class CGangjwaControl extends CControl {

	public Vector<CGangjwa> getGangjwaList() throws FileNotFoundException {
		// read entity list
		Vector<CGangjwa> gangjwaList =  new Vector<CGangjwa>();
		this.getDao().connect("gangjwa.txt");
		while (this.getDao().hasNext()) {
			CGangjwa gangjwa = new CGangjwa();
			gangjwa = (CGangjwa)this.getDao().readNext(gangjwa);
			gangjwaList.add(gangjwa);
		}
		this.getDao().disconnect();
		return gangjwaList;
	}

	public void sugangSincheong(CSugang sugang) {
		// TODO Auto-generated method stub
		
	}

}
