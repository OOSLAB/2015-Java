package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CMainView extends CView {

	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[�л���� �ý���]");
		System.out.println("1.�α���");
		System.out.println("2.ȸ������");
		System.out.println("0.����");
		System.out.print("�޴�����: ");
		
		int temp = scanner.nextInt();
		EViewType selection = null;
		
		for(EViewType eViewType : EViewType.values()) {
			if(eViewType.ordinal() == temp) {
				selection = eViewType;
			}
		}
		
		return selection;
	}

}
