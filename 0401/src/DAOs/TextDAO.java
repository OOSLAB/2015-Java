package DAOs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import entity.CEntity;

public class TextDAO implements IDAO {

	@Override
	public CEntity read(String fileName) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void write(CEntity entity, String fileName) {
		// TODO Auto-generated method stub
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			entity.write(bw);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

}
