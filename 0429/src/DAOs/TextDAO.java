package DAOs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;

public class TextDAO implements IDAO {
	private Scanner scanner;
	private BufferedWriter writer;
	private String mode;
	@Override
	public void connect(String name, String mode) throws IOException {
		// TODO Auto-generated method stub
		this.mode = mode;
		if (this.mode.equals("r")) {
			this.scanner = new Scanner(new File(name));
		} else if (this.mode.equals("w")) {
			// create new file
			this.writer = new BufferedWriter(new FileWriter(name, false));
		} else if (this.mode.equals("w+")) {
			// append item to existing file
			this.writer = new BufferedWriter(new FileWriter(name, true));		
		}
	}

	@Override
	public void disconnect() throws IOException {
		// TODO Auto-generated method stub
		if (this.mode.equals("r")) {
			this.scanner.close();
		} else {
			this.writer.close();
		}
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return scanner.hasNext();
	}
	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		entity.read(scanner);
		return entity;
	}
	@Override
	public CEntity read(CEntity entity, String ID) {
		// TODO Auto-generated method stub
		while (scanner.hasNext()) {
			entity.read(scanner);
			if (entity.getID().equals(ID))
				return entity;
		}
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		entity.write(writer);		
	}

}
