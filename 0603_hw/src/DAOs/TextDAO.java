package DAOs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import entity.CEntity;

public class TextDAO implements IDAO {
	
	private BufferedWriter bufferedWriter;
	private BufferedReader bufferedReader;

	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void disconnect() throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void createAccount() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void createDB() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTable() throws Exception {
		// TODO Auto-generated method stub
		bufferedWriter = new BufferedWriter(new FileWriter("file"));
	}

	@Override
	public void insertData() throws Exception {
		// TODO Auto-generated method stub
		String line = "id0 pw0 name0";
		bufferedWriter.write(line);
		bufferedWriter.newLine();
		line = "id1 pw1 name1";
		bufferedWriter.write(line);
		bufferedWriter.newLine();
		line = "id2 pw2 name2";
		bufferedWriter.write(line);
		bufferedWriter.newLine();
		line = "id3 pw3 name3";
		bufferedWriter.write(line);
		bufferedWriter.newLine();
		line = "id4 pw4 name4";
		bufferedWriter.write(line);
		bufferedWriter.newLine();
		bufferedWriter.close();
	}

	@Override
	public void updataData() throws Exception {
		// TODO Auto-generated method stub
		String nowLine = "";
		String oldData = "id0 pw0 name0";
		String updateDate = "id5 pw5 name5";
		
		bufferedReader = new BufferedReader(new FileReader("file"));
		bufferedWriter = 
				new BufferedWriter(new FileWriter("updateFile"));
		
		while((nowLine = bufferedReader.readLine()) != null) {
			if(!nowLine.equals(oldData)) {
				bufferedWriter.write(nowLine);
				bufferedWriter.newLine();
			}
		}
		bufferedWriter.write(updateDate);
		bufferedWriter.close();
		bufferedReader.close();
		
		File file = new File("file");
		file.delete();
		
		file = new File("updateFile");
		file.renameTo(new File("file"));
		
//		bufferedReader = new BufferedReader(new FileReader("updateFile"));
//		bufferedWriter = 
//				new BufferedWriter(new FileWriter("file"));
//		while((nowLine = bufferedReader.readLine()) != null) {
//			bufferedWriter.write(nowLine);
//			bufferedWriter.newLine();
//		}
//		bufferedWriter.close();
//		bufferedReader.close();
//		
//		file = new File("updateFile");
//		file.delete();
	}

	@Override
	public void selectData() throws Exception {
		// TODO Auto-generated method stub
		String nowLine = "";
		
		bufferedReader = new BufferedReader(new FileReader("file"));
		while((nowLine = bufferedReader.readLine()) != null) {
			System.out.println(nowLine);
		}
		bufferedReader.close();
	}

	@Override
	public void deleteData() throws Exception {
		// TODO Auto-generated method stub
		String nowLine = "";
		String deleteData = "id5 pw5 name5";
		
		bufferedReader = new BufferedReader(new FileReader("file"));
		bufferedWriter = 
				new BufferedWriter(new FileWriter("deleteFile"));
		
		while((nowLine = bufferedReader.readLine()) != null) {
			if(!nowLine.equals(deleteData)) {
				bufferedWriter.write(nowLine);
				bufferedWriter.newLine();
			}
		}
		bufferedWriter.close();
		bufferedReader.close();
		
		File file = new File("file");
		file.delete();
		
		file = new File("deleteFile");
		file.renameTo(new File("file"));
		
//		bufferedReader = new BufferedReader(new FileReader("deleteFile"));
//		bufferedWriter = 
//				new BufferedWriter(new FileWriter("file"));
//		while((nowLine = bufferedReader.readLine()) != null) {
//			bufferedWriter.write(nowLine);
//			bufferedWriter.newLine();
//		}
//		bufferedWriter.close();
//		bufferedReader.close();
//		
//		file = new File("deleteFile");
//		file.delete();
	}

	@Override
	public void dropTable() throws SQLException {
		// TODO Auto-generated method stub
		File file = new File("file");
		file.delete();
	}

	@Override
	public void dropDB() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropAccount() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public CEntity read(CEntity entity, String ID) throws SQLException {
		// TODO Auto-generated method stub
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
