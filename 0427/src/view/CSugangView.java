package view;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;

public class CSugangView extends CView {

	public void sugangSincheong(VUser vUser) {
		// show Gangjwa List
		try {
			CGangjwaControl gnajwaControl = (CGangjwaControl)this.getControl();
			Vector<CGangjwa> gangjwaList = gnajwaControl.getGangjwaList();
			System.out.println("°­ÁÂ ID ÀÔ·Â ÇÏ¼¼¿ä");
			for (CGangjwa gangjwa: gangjwaList) {
				System.out.println(
						"°­ÁÂ ID:"+gangjwa.getID()+" "+gangjwa.getName());		
			}
			Scanner scanner = new Scanner(System.in);
			String gangjwaID = scanner.next();
			for (CGangjwa gangjwa: gangjwaList) {
				if (gangjwa.getID().equals(gangjwaID)) {
					CSugang sugang = 
							new CSugang(vUser.getUserID(), gangjwa.getID());
					gnajwaControl.sugangSincheong(sugang);
				}
			}			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// select Gangjwa
		// confirm sugangSincheong
		// show result		
		
	}

}
