package project02_Mart;

public class Purchase {
	
	public Purchase(Keyboard keyboard) {
		
		for(int i=0; i<keyboard.keyboardBasket.size(); i++) {	
			System.out.println(keyboard.keyboardBasket.get(i).keyboard_menu
					+ "\t" + keyboard.keyboardBasket.get(i).keyboard_price + "��");
		}				
		System.out.println("�� " + keyboard.total + "���� �����Ǿ����ϴ�.");
		
	}
	
}
