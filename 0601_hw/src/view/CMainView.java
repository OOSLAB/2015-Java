package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CMainView extends CView {

	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[학사관리 시스템]");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("0.종료");
		System.out.print("메뉴선택: ");
		
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
