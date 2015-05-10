package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;

public class TextDAO implements IDAO 
{
	private Scanner scanner;
	@Override
	public void connect(String name) throws FileNotFoundException 
	{
		this.scanner = new Scanner(new File(name));
	}
	@Override
	public void disconnect() 
	{
		this.scanner.close();
	}
	@Override
	public CEntity read(CEntity entity, String ID) 
	{
		while(scanner.hasNext())
		{
			entity.read(scanner);
			if(entity.getId().equals(ID))
			{
				return entity;
			}	
		}
		return null;
	} 
	@Override	
	public void write(CEntity entity) 
	{
		entity.write(scanner);
	}
	@Override
	public Vector<CGangjwa> readAll() 
	{
		return null;
	}
}
