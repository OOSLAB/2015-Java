package view;

import java.util.Scanner;

import main.Constant.EEvent;

public class CSetGradeView extends CView {

	@Override
	public EEvent show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[�����Է�ȭ��]");
		System.out.println("9. �����޴��� �̵�");
		System.out.println("0. �α׾ƿ�");
		System.out.print("�޴�����: ");

		EEvent selection = EEvent.values()[scanner.nextInt()];

		return selection;
	}

}