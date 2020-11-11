package project02_Mart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keyboard {
	Scanner scan = new Scanner(System.in);
	int total;
	
	List<Basket> keyboardBasket = new ArrayList();

	Basket keyboardlist1 = new Basket("���̹� Ű����", 30000);
	Basket keyboardlist2 = new Basket("����Ű����", 15000);
	Basket keyboardlist3 = new Basket("����Ű����", 20000);
	Basket keyboardlist4 = new Basket("Ű����/���콺 ��Ʈ", 25000);

	public Keyboard() {
		
	}

	public void keyboard_category(Keyboard keyboard) {
		System.out.println("Ű���� ī�װ��Դϴ�. �����Ͻ� Ű���带 �����ϼ���. ");
		System.out.println("1.���̹� Ű���� " + 30000 + "��");
		System.out.println("2.����Ű���� " + 15000 + "��");
		System.out.println("3.����Ű���� " + 20000 + "��");
		System.out.println("4.Ű����/���콺 ��Ʈ " + 25000 + "��");
		int keyboard_choice = scan.nextInt();
		
		if(keyboard_choice == 1) {
			keyboardBasket.add(keyboardlist1);
			total = total + 30000;
		}
		else if(keyboard_choice == 2) {
			keyboardBasket.add(keyboardlist2);
			total = total + 15000;	
		}
		else if(keyboard_choice == 3) {
			keyboardBasket.add(keyboardlist3);
			total = total + 20000;	
		}
		else {	
			keyboardBasket.add(keyboardlist4);
			total = total + 25000;	
		} 
		
		keyboardinfo(keyboard);
	} // keyboard_category()
	
	public void keyboardinfo(Keyboard keyboard) {
		System.out.println("���Ÿ� �Ͻǰǰ���? (Y/N)");
		String purchase_question = scan.next();
		
		if(purchase_question.equals("Y")) {
			System.out.println("1.�ٷ� �����ϱ�\t2.��ٱ��Ͽ� ���");
			int question = scan.nextInt();
			if(question == 1) {
				System.out.println("������ ��ǰ������");
				new Purchase(keyboard);
			}
			if(question == 2) {
				System.out.println("�����Ͻ� ��ǰ�� ��ٱ��Ͽ� �־����ϴ�.");
				System.out.println("��ٱ��Ϸ� �̵��Ͻðڽ��ϱ�? \n 1.�̵� \t 2.��� ����");
				int basket_go = scan.nextInt();
				if(basket_go == 1) {
					new Basket(keyboard);
				} else {
					new Mouse();
				}
			}
		}
		if(purchase_question.equals("N")) {
			new Mouse();
		}
		
	} //keyboardinfo()
}
