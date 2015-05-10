package entity;

import java.io.Serializable;
import java.util.Scanner;

public abstract class CEntity implements Serializable 
{
	private static final long serialVersionUID = 1L;
	protected String ID;

	public String getId() {return ID;}
	public void setId(String ID) {this.ID = ID;}

	public abstract void read(Scanner scanner);
	public abstract void write(Scanner scanner);
}
