package view;

import java.util.Scanner;

import main.Constant;
import main.Constant.EEvent;

public class CStudentView extends CView {

	@Override
	public EEvent show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[�л�ȭ��]");
		System.out.println("7.������û");
		System.out.println("8.������ȸ");
		System.out.println("0.�α׾ƿ�");
		System.out.print("�޴�����: ");
		EEvent selection = EEvent.values()[scanner.nextInt()];
		return selection;
	}

}
