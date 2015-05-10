package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;

public class CGwamok {
	private static final long serialVersionUID = 1L;
	// Attribute
	private String ID;
	private String name;
	private int hakjeom;
	// Setters & Getters
	public String getID() {return ID;}
	public void setID(String iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}

	public Vector<Object> read(String fileName)
	{
		CGwamok gwamok = null;
		Vector<Object> objectVector = new Vector<Object>();
		File file = new File(fileName);
		FileReader writer;
		try {
			writer = new FileReader(file);
			BufferedReader in = new BufferedReader(writer);
			String temp;
			
			while((temp = in.readLine()) != null)
			{
				gwamok = new CGwamok();
				gwamok.setID(temp.split(" ")[0]);
				gwamok.setName(temp.split(" ")[1]);
				gwamok.setHakjeom(Integer.parseInt(temp.split(" ")[2]));
				objectVector.add(gwamok);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return objectVector;
	}
}