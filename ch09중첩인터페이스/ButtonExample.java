package ch09중첩인터페이스;


public class ButtonExample {

	public static void main(String[] args) {
		
		Button okButton = new Button();
		Button cancelButton = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("ok");
			}
		}
		class cancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("cancel");				
			}			
		}
		
		okButton.setClickListener(new OkListener());
		okButton.click();
		
		cancelButton.setClickListener(new cancelListener());
		cancelButton.click();
	}
}