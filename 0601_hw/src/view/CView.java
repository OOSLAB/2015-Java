package view;

import java.util.Scanner;

import control.CControl;

abstract public class CView {
	public static enum EViewType {
		ELogout,
		ELoginView,
		EUserRegisterView,
		EGangjwaCreationView,
		EGangjwaEnquiryView,
		ESeongjeokInputView,
		ESeongjeokEnquiryPView,
		EClassRegistrationView,
		ESeongjeokEnquirySView,
		EBeforeView
	};
	
	private EViewType eViewType;
	private CView parentView;
	
	public EViewType geteViewType() {return eViewType;}
	public void seteViewType(EViewType eViewType) {this.eViewType = eViewType;}
	public CView getParentView() {return parentView;}
	public void setParentView(CView parentView) {this.parentView = parentView;}

	public void add(CView component) {
		component.setParentView(this);
	}

	// association
	private CControl control;
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	abstract public EViewType show(Scanner scanner);
}
