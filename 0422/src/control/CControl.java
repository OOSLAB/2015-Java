package control;

import DAOs.IDAO;

public class CControl 
{
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}
}