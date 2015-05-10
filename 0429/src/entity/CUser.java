package entity;

import java.io.BufferedWriter;
import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String password;
	private String name;	
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public void read(Scanner scanner) {
		ID = scanner.next();
		password = scanner.next();
		name = scanner.next();
	};
	public void write(Scanner scanner) {		
	}
	@Override
	public void write(BufferedWriter scanner) {
		// TODO Auto-generated method stub
		
	};

}






