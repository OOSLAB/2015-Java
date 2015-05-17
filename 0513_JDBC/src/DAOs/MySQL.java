package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.CEntity;

public class MySQL implements IDAO{

	private final static String DRIVER = "com.mysql.jdbc.Driver";	//����̹� ���
	private final static String URL = "jdbc:mysql://localhost:3306";	//DB URL
	private final static String ID = "root";		//account�� id, pw
	private final static String PASSWORD = "5441";
	
	private Connection connection;	//�����͸� �޴� ä��
	private Statement statement;	//�����͸� ������ ä��
	private ResultSet resultSet;
	private String tableName;
	
	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER);
	}
	
	@Override
	public void create() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ID, PASSWORD);
		String sql = "grant all privileges on *.* to java@localhost "
				+ "identified by 'mju12345' with grant option;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	
	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ID, PASSWORD);		//DB�� �α����Ѱ�
		this.tableName = name;
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select* from "+ this.tableName);	//���̺����� �����͸� Ȧ��� �޾ƿͶ�
	}

	@Override
	public void disconnect() throws IOException, SQLException {
		// TODO Auto-generated method stub
		if(connection==null){
			return;
		}
		connection.close();
		statement.close();
		resultSet.close();
	}

	@Override
	public CEntity read(CEntity entity, String ID) throws SQLException {
		// TODO Auto-generated method stub
		while(resultSet.next()){
			entity.DBRead(resultSet);
			if(entity.getID().equals(ID)){
				return entity;
			}
		}
		return null;
	}

	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	

}