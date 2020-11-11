package project02_Mart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keyboard01 {
	Scanner scan;
	int total;
	Menu m;
	Basket basket;
	
	List<Basket> keyboardBasket = new ArrayList<>();
	//ArrayList<String> key_menuArr = new ArrayList();
	//ArrayList<Integer> key_priceArr = new ArrayList();
	
	public Keyboard01(){
		scan = new Scanner(System.in); 
		System.out.println("여기 왜 안나와");
		m = new Menu();
		basket = new Basket();
		//keyboard_category();
	}
	
	public void keyboard_category() {
		System.out.println("키보드 카테고리입니다. 구매하실 키보드를 선택하세요. ");
		System.out.println("1.게이밍 키보드 " + 30000 + "원");
		System.out.println("2.유선키보드 " + 15000 + "원");
		System.out.println("3.무선키보드 " + 20000 + "원");
		System.out.println("4.키보드/마우스 세트 " + 25000 + "원");
		int keyboard_choice = scan.nextInt();
		
		if(keyboard_choice == 1) {
			//key_menuArr.add("1.게이밍 키보드");
			//key_priceArr.add(30000);
					
			Basket keyboardlist1 = new Basket("1.게이밍 키보드", 30000);
			keyboardBasket.add(keyboardlist1);
			total = total + 30000;
		}
		else if(keyboard_choice == 2) {
			//key_menuArr.add("2.유선키보드");
			//key_priceArr.add(15000);
			
			Basket keyboardlist2 = new Basket("2.유선키보드", 15000);
			keyboardBasket.add(keyboardlist2);
			total = total + 15000;	
		}
		else if(keyboard_choice == 3) {
			//key_menuArr.add("3.무선키보드");
			//key_priceArr.add(20000);
			Basket keyboardlist3 = new Basket("3.무선키보드", 20000);
			keyboardBasket.add(keyboardlist3);
			total = total + 20000;	
		}
		else {
			//key_menuArr.add("4.키보드/마우스 세트");
			//key_priceArr.add(25000);
			
			Basket keyboardlist4 = new Basket("4.키보드/마우스 세트", 25000);
			keyboardBasket.add(keyboardlist4);
			total = total + 25000;	
		} 
		
		keyboard_question(null);
	} // keyboard_category
	
	public void keyboard_question(String Basket) {
		System.out.println("구매를 하실건가요? (Y/N)");
		String purchase_question = scan.next();
		
		if(purchase_question.equals("Y")) {
			System.out.println("1.구매하기\t2.장바구니에 넣기");
			int question = scan.nextInt();
			if(question == 1) {
				System.out.println("구매한 상품영수증");
				//System.out.println(key_menuArr.get(0) + key_priceArr.get(0));
				for(int i=0; i<keyboardBasket.size(); i++) {	
					System.out.println(keyboardBasket.get(i).keyboard_menu
							+ "\t" + keyboardBasket.get(i).keyboard_price);
				}
				//basket.setKeyboard_menu(Basket);
				
				System.out.println(total + "원");
			}
			if(question == 2) {
				System.out.println("선택하신 상품을 장바구니에 넣었습니다.");
				//System.out.println(keyboardBasket.get(question));
				
				//System.out.println(key_menuArr.get(0) + key_priceArr.get(0));
			}
			m.menuchoice();
		}
		if(purchase_question.equals("N")) {
			new Mouse();
		}
		
	}
}
