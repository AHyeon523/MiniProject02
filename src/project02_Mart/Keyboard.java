package project02_Mart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keyboard {
	Scanner scan = new Scanner(System.in);
	int total;
	
	List<Basket> keyboardBasket = new ArrayList();

	Basket keyboardlist1 = new Basket("게이밍 키보드", 30000);
	Basket keyboardlist2 = new Basket("유선키보드", 15000);
	Basket keyboardlist3 = new Basket("무선키보드", 20000);
	Basket keyboardlist4 = new Basket("키보드/마우스 세트", 25000);

	public Keyboard() {
		
	}

	public void keyboard_category(Keyboard keyboard) {
		System.out.println("키보드 카테고리입니다. 구매하실 키보드를 선택하세요. ");
		System.out.println("1.게이밍 키보드 " + 30000 + "원");
		System.out.println("2.유선키보드 " + 15000 + "원");
		System.out.println("3.무선키보드 " + 20000 + "원");
		System.out.println("4.키보드/마우스 세트 " + 25000 + "원");
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
		System.out.println("구매를 하실건가요? (Y/N)");
		String purchase_question = scan.next();
		
		if(purchase_question.equals("Y")) {
			System.out.println("1.바로 구매하기\t2.장바구니에 담기");
			int question = scan.nextInt();
			if(question == 1) {
				System.out.println("구매한 상품영수증");
				new Purchase(keyboard);
			}
			if(question == 2) {
				System.out.println("선택하신 상품을 장바구니에 넣었습니다.");
				System.out.println("장바구니로 이동하시겠습니까? \n 1.이동 \t 2.계속 쇼핑");
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
