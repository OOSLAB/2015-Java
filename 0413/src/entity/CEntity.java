package entity;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	public void read(Scanner scanner) throws NoSuchElementException, IllegalStateException  {};
	public void write(Scanner scanner) {};
}
