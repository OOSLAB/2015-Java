package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.CEntity;

public class MySQL implements IDAO{

	private final static String DRIVER = "com.mysql.jdbc.Driver";	//드라이버 경로
	private final static String URL = "jdbc:mysql://localhost:3306/javaLMS";	//DB URL
	private final static String ID = "java";		//account의 id, pw
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;	//데이터를 받는 채널
	private Statement statement;	//데이터를 보내는 채널
	private ResultSet resultSet;
	private String tableName;
	
	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER);
		
		
	}
	
	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ID, PASSWORD);		//DB에 로그인한것
		this.tableName = name;
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select* from "+ this.tableName);	//테이블에서 데이터를 홀라당 받아와라
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
