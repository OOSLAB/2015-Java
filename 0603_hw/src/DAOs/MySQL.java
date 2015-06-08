package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import entity.CEntity;

public class MySQL implements IDAO{

	private final static String DRIVER = "com.mysql.jdbc.Driver";	//드라이버 경로
	private final static String URL = "jdbc:mysql://localhost:3306/javalms";	//DB URL
	private final static String ID = "java";		//account의 id, pw
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;	//데이터를 받는 채널
	private Statement statement;	//데이터를 보내는 채널
	private PreparedStatement pStatement;
	private ResultSet resultSet;
	private String tableName;
	
	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER);
	}
	
	@Override
	public void createAccount() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/"
				, "root"
				, "5441");
		String sql = "grant all privileges on *.* to java@localhost "
				+ "identified by 'mju12345' with grant option;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	
	@Override
	public void createDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/"
				, ID
				, PASSWORD);
		String sql = "create database javalms;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void createTable() throws Exception {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "create table user"
				+ "(id varchar(10) not null primary key,"
				+ "password varchar(10) not null,"
				+ "name varchar(10) not null);";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void insertData() throws Exception {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "insert into user (id, password, name) "
				+ "values (?, ?, ?);";
		pStatement = (PreparedStatement) 
				connection.prepareStatement(sql);
		pStatement.setString(1, "id0");
		pStatement.setString(2, "pw0");
		pStatement.setString(3, "name0");
		pStatement.executeUpdate();
		pStatement.setString(1, "id1");
		pStatement.setString(2, "pw1");
		pStatement.setString(3, "name1");
		pStatement.executeUpdate();
		pStatement.setString(1, "id2");
		pStatement.setString(2, "pw2");
		pStatement.setString(3, "name2");
		pStatement.executeUpdate();
		pStatement.setString(1, "id3");
		pStatement.setString(2, "pw3");
		pStatement.setString(3, "name3");
		pStatement.executeUpdate();
		pStatement.setString(1, "id4");
		pStatement.setString(2, "pw4");
		pStatement.setString(3, "name4");
		pStatement.executeUpdate();
		
		connection.close();
		pStatement.close();
	}

	@Override
	public void updataData() throws Exception {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "update user set id='id5', password='pw5', "
				+ "name='name5' where id='id0';";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void selectData() throws Exception {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "select* from user;";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			String id = resultSet.getString("id");
			String password = resultSet.getString("password");
			String name = resultSet.getString("name");
			System.out.println(id+" "+password+" "+name);
		}
		
		connection.close();
		statement.close();
		resultSet.close();
	}

	@Override
	public void deleteData() throws Exception {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "delete from user where id='id5';";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void dropTable() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "drop table user;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void dropDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				(URL
				, ID
				, PASSWORD);
		String sql = "drop database javalms;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}

	@Override
	public void dropAccount() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306"
				, "root"
				, "5441");
		String sql = "drop user java@localhost;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
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
