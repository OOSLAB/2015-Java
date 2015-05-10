
public class Main {

	public static void main(String[] args) {
		CView mainView = new CView("메인");
		CView hakseangView = new CView("학생메뉴");
		CView gyosuView = new CView("교수메뉴");
		CView sugangsincheongView = new CView("수강신청");
		CView sugangNeayeokView = new CView("수강내역조회");
		CView seongjeokView = new CView("성적조회");
		
		mainView.add(hakseangView);
		mainView.add(gyosuView);
		hakseangView.add(sugangsincheongView);
		hakseangView.add(sugangNeayeokView);
		hakseangView.add(seongjeokView);
		mainView.show();
	}

}
