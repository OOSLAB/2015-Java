package view;

import java.util.Scanner;

import view.CView.EViewType;

public class CSeongjeokEnquirySView extends CView {

	public CSeongjeokEnquirySView() {
		this.seteViewType(EViewType.ESeongjeokEnquirySView);
	}
	
	@Override
	public EViewType show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[학생성적확인화면]");
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
