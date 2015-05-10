package entity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CGangjwaDAO {

	public void write(CGangjwa gangjwa) {
		System.out.println("과목ID: " + gangjwa.getID());
		System.out.println(",과목명: " + gangjwa.getName());
		// serialize
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
