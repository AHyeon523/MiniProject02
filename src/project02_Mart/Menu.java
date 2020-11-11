package project02_Mart;

import java.util.Scanner;

public class Menu {
	Scanner scan;
	
	public Menu() {
		
	}
	public void welcome(Keyboard keyboard) {
		scan = new Scanner(System.in);
		System.out.println("=-=-=-=-=-=-=-=-=-=-");
		System.out.println("하이마트에 오신걸 환영합니다.");
		System.out.println("=-=-=-=-=-=-=-=-=-=-");
		menuchoice(keyboard);
	}
	public void menuchoice(Keyboard keyboard) {
		for(;;) {
			System.out.print("메뉴를 선택하세요.\n 1.구매하기\t 2.장바구니 확인\n >> ");
			int menu_choice = scan.nextInt();
			if(menu_choice == 1) {
				productlist(keyboard);
			}
			if(menu_choice == 2) {
				new Basket(keyboard);
			}
				
		}
	}
	public void productlist(Keyboard keyboard) {
		for(;;) {
			System.out.print("컴퓨터 상품목록입니다.\n 1.키보드\t 2.마우스\t 3.모니터 \n 구매하실 상품을 선택하세요.\n >> ");
			int productlist_choice = scan.nextInt();

			 if(productlist_choice == 1) { 
			   keyboard.keyboard_category(keyboard);
			   break;
			 } 
			 if(productlist_choice == 2) { 
			   new Mouse();
			   break;
			 } 
			 if(productlist_choice == 3) { 
			   new Moniter();
			   break;
			 }
		}
	}
}
