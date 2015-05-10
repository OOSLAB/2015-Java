package DAOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.CEntity;

public class ObjectDAO implements IDAO {
	public CEntity read(String fileName) {
		CEntity entity = null;
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(fileName));
			entity = (CEntity) in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
		
	}
	public void write(CEntity entity, String fileName) {
	// serialize
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(entity);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
