package entity;

import java.util.Scanner;
import java.util.Vector;

public class CSugang extends CEntity
{
	private String id;
	private Vector<String> sugangVt;

	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public Vector<String> getSugangVt() {return sugangVt;}
	public void setSugangVt(Vector<String> sugangVt) {this.sugangVt = sugangVt;}
	
	public void read(Scanner scanner)
	{
		id = scanner.next();
		sugangVt = new Vector<String>();
		sugangVt.add(scanner.next());
		sugangVt.add(scanner.next());
	}
	public void write(Scanner scanner){}
}