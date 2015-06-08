package view;

import java.util.Scanner;

import main.Constant.EEvent;

public class CCreateClassView extends CView {

	@Override
	public EEvent show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[강좌개설화면]");
		System.out.println("9. 이전메뉴로 이동");
		System.out.println("0. 로그아웃");
		System.out.print("메뉴선택: ");

		EEvent selection = EEvent.values()[scanner.nextInt()];
		
		return selection;
	}

}
