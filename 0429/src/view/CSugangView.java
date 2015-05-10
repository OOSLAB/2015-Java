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
			// ���� ����Ʈ ��������
			CGangjwaControl ganjwaControl = (CGangjwaControl)this.getControl();
			Vector<CGangjwa> gangjwaList = ganjwaControl.getGangjwaList();
			for (CGangjwa gangjwa: gangjwaList) {
				System.out.println(
						"���� ID:"+gangjwa.getID()+" "+gangjwa.getName());		
			}
			// ������û ���� ��ȣ �Է�
			System.out.print("���� ID �Է� �ϼ���: ");
			Scanner scanner = new Scanner(System.in);
			String gangjwaID = scanner.next();
			// ���� ��ȣ�� ��ȿ�� Ȯ��
			for (CGangjwa gangjwa: gangjwaList) {
				if (gangjwa.getID().equals(gangjwaID)) {
					CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getID());
					ganjwaControl.sugangSincheong(sugang);
					return;
				}
			}
			throw new IOException("���� ���̵� ��ġ ���� �ʽ��ϴ�.!");
			// select Gangjwa
			// confirm sugangSincheong
			// show result		
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
