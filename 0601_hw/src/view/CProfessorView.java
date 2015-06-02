package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CProfessorView extends CView {

	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[교수화면]");
		System.out.println("3.강좌개설");
		System.out.println("4.강좌조회");
		System.out.println("5.성적입력");
		System.out.println("6.성적조회");
		System.out.println("9.이전메뉴로 이동");
		System.out.println("0.로그아웃");
		System.out.print("메뉴선택: ");
		
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
