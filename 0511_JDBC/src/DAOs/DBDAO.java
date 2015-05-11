package DAOs;

import java.io.IOException;
import java.sql.*;

import entity.CEntity;

public class DBDAO implements IDAO{
	private final static String URL = "jdbc:mysql://localhost:3306/java";
	private final static String ID ="root";
	private final static String PASSWORD = "mju12345";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String mode;
	private String tableName;
	
	public DBDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(URL,ID,PASSWORD);
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
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select* from "+this.tableName);
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
			stmt.close();
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
