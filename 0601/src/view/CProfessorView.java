package view;

import java.util.Scanner;

public class CProfessorView extends CView {

	@Override
	public int show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[����ȭ��]");
		System.out.println("3.���°���");
		System.out.println("4.������ȸ");
		System.out.println("5.�����Է�");
		System.out.println("6.������ȸ");
		System.out.println("0.�α׾ƿ�");
		System.out.print("�޴�����: ");
		int selection = scanner.nextInt();
		return selection;
	}

}
