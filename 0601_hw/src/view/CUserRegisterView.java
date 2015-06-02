package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CUserRegisterView extends CView {

	public CUserRegisterView() {
		this.seteViewType(EViewType.EUserRegisterView);
	}
	
	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[ȸ������ȭ��]");
		System.out.println("9.�����޴��� �̵�");
		System.out.println("0.����");
		System.out.print("�޴�����: ");
		
		int temp = scanner.nextInt();
		EViewType selection = null;
		
		for(EViewType eViewType : EViewType.values()) {
			if(eViewType.ordinal() == temp) {
				selection = eViewType;
			}
			if(selection == EViewType.EBeforeView) {
				selection = this.getParentView().show(scanner);
			}
		}
		
		return selection;
	}

}
