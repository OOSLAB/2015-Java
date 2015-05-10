package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable
{
	private String password;
	private String name;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public void read(Scanner scanner)
	{
		ID = scanner.next();
		password = scanner.next();
		name = scanner.next();
	}
	public void write(Scanner scanner){}
}
