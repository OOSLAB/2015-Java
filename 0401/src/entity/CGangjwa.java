package entity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;

public class CGangjwa extends CEntity {
	private static final long serialVersionUID = 1L;
	// attributes
	public int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times;
	private int gyosuID;
	private int gwamokID;
	// setters & getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void write(BufferedWriter bw) {
		try {
			bw.
			bw.write(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
