package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CGangjwaCreationView extends CView {
	
	public CGangjwaCreationView() {
		this.seteViewType(EViewType.EGangjwaCreationView);
	}
	
	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[���°���ȭ��]");
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
