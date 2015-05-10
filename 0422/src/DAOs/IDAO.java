package DAOs;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;

public interface IDAO 
{
	// �����ڿ��� �����ɶ� ������ �� �ִ�. Mutually Exclusion
	public void connect(String name) throws FileNotFoundException;
	public CEntity read(CEntity entity,String ID);
	public void write(CEntity entity);
	public void disconnect();
	public Vector<CGangjwa> readAll();
}
