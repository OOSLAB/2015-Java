package DAOs;

import entity.CEntity;

public interface IDAO {
	public CEntity read(String fileName);
	public void write(CEntity entity, String fileName);
}
