package project02_Mart;

public class Basket {
	String keyboard_menu;
	int keyboard_price;

	public Basket(Keyboard keyboard) {	
		/*
		 * if(getKeyboard_menu() != null) { System.out.println(getKeyboard_menu() + "\t"
		 * + getKeyboard_price() + "��"); } else {
		 * System.out.println("���� ��ٱ��Ͽ� ��� ��ǰ�� �����ϴ�."); }
		 */
		
		for(int i=0; i<keyboard.keyboardBasket.size(); i++) {
			if(keyboard.keyboardBasket.get(i) == null) {
				System.out.println("���� ��ٱ��Ͽ� ��� ��ǰ�� �����ϴ�.");
			}	
		}
		System.out.println("���� ��ٱ��Ͽ� ��� ��ǰ ����Դϴ�.");
		System.out.println(keyboard.keyboardBasket.toString());
	}
	
	public Basket(String keyboard_menu, int keyboard_price) {
			this.keyboard_menu = keyboard_menu;
			this.keyboard_price = keyboard_price;
	}

	public String getKeyboard_menu() {
		return keyboard_menu;
	}

	public int getKeyboard_price() {
		return keyboard_price;
	}


	@Override
	public String toString() {
		return keyboard_menu + "\t" + keyboard_price + "��" + "\n";
	}
	
	
}
