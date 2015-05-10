package view;

import java.io.IOException;
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
			// 강좌 리스트 가져오기
			CGangjwaControl ganjwaControl = (CGangjwaControl)this.getControl();
			Vector<CGangjwa> gangjwaList = ganjwaControl.getGangjwaList();
			for (CGangjwa gangjwa: gangjwaList) {
				System.out.println(
						"강좌 ID:"+gangjwa.getID()+" "+gangjwa.getName());		
			}
			// 수강신청 강좌 번호 입력
			System.out.print("강좌 ID 입력 하세요: ");
			Scanner scanner = new Scanner(System.in);
			String gangjwaID = scanner.next();
			// 강좌 번호의 유효성 확인
			for (CGangjwa gangjwa: gangjwaList) {
				if (gangjwa.getID().equals(gangjwaID)) {
					CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
					ganjwaControl.sugangSincheong(sugang);
					return;
				}
			}
			throw new IOException("강좌 아이디가 일치 하지 않습니다.!");
			// select Gangjwa
			// confirm sugangSincheong
			// show result		
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
