package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CProfessorView extends CView {

	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[����ȭ��]");
		System.out.println("3.���°���");
		System.out.println("4.������ȸ");
		System.out.println("5.�����Է�");
		System.out.println("6.������ȸ");
		System.out.println("9.�����޴��� �̵�");
		System.out.println("0.�α׾ƿ�");
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
