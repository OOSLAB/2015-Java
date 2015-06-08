package DAOs;

import java.io.IOException;
import java.sql.SQLException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws IOException, SQLException;
	public void disconnect() throws IOException, SQLException;
	
	public void createAccount() throws SQLException;
	public void createDB() throws SQLException;
	public void createTable() throws Exception;
	public void insertData() throws Exception;
	public void updataData() throws Exception;
	public void selectData() throws Exception;
	public void deleteData() throws Exception;
	public void dropTable() throws SQLException;
	public void dropDB() throws SQLException;
	public void dropAccount() throws SQLException;
	
	public CEntity read(CEntity entity, String ID) throws SQLException;
	public CEntity readNext(CEntity entity);
	public void write(CEntity entity) throws IOException;
	public boolean hasNext();
}
