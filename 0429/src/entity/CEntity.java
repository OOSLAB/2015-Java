package entity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Scanner;

abstract public class CEntity implements Serializable {

	protected static final long serialVersionUID = 1L;
	protected String ID;
	
	public String getID() {return ID;}
	public void setID(String ID) {this.ID = ID;}
	
	abstract public void read(Scanner scanner) throws NoSuchElementException, IllegalStateException;
	abstract public void write(BufferedWriter bufferWriter) throws IOException;
}
