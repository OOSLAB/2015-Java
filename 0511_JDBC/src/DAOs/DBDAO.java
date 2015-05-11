package DAOs;

import java.io.IOException;
import java.sql.*;

import entity.CEntity;

public class DBDAO implements IDAO{
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/javalms";
	private final static String ID ="java";
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private String tableName;
	
	public DBDAO() {
		try {
			Class.forName(DRIVER);
			try {
				connection = DriverManager.getConnection(URL,ID,PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void connect(String name) {
		// TODO Auto-generated method stub
		this.tableName = name;

		try {
			statement = connection.createStatement();
			rs = statement.executeQuery("select* from "+this.tableName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void disconnect() throws IOException {
		// TODO Auto-generated method stub
		if(conn ==null){
	         return;
		}
		try {
			conn.close();
			statement.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public CEntity read(CEntity entity, String ID) {
		try {
			while (rs.next()) {
				entity.DBRead(rs);
				if (entity.getID().equals(ID))
					return entity;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		try {
			entity.DBRead(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		try {
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
