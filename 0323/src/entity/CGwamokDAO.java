package entity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CGwamokDAO {
	public CMember read() { return null; }
	public void write(CGwamok gwamok) {
		System.out.println("����ID: " + gwamok.getID());
		System.out.println(",�����: " + gwamok.getName());
		// serialize
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("gwamok"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

}
