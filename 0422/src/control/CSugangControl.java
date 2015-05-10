package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import DAOs.IDAO;
import entity.CGangjwa;
import entity.CUser;


public class CSugangControl extends CControl 
{
	public Vector<CGangjwa> getGangjwaList() throws FileNotFoundException 
	{
		this.getDao().connect("gangjwa.txt");
		Vector<CGangjwa> gangjwaList = (Vector<CGangjwa>)this.getDao().readAll();
		this.getDao().disconnect();
		return gangjwaList;
	}
}
