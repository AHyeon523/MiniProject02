package project02_Mart;

import java.util.Scanner;

public class Menu {
	Scanner scan;
	
	public Menu() {
		
	}
	public void welcome(Keyboard keyboard) {
		scan = new Scanner(System.in);
		System.out.println("=-=-=-=-=-=-=-=-=-=-");
		System.out.println("���̸�Ʈ�� ���Ű� ȯ���մϴ�.");
		System.out.println("=-=-=-=-=-=-=-=-=-=-");
		menuchoice(keyboard);
	}
	public void menuchoice(Keyboard keyboard) {
		for(;;) {
			System.out.print("�޴��� �����ϼ���.\n 1.�����ϱ�\t 2.��ٱ��� Ȯ��\n >> ");
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
			System.out.print("��ǻ�� ��ǰ����Դϴ�.\n 1.Ű����\t 2.���콺\t 3.����� \n �����Ͻ� ��ǰ�� �����ϼ���.\n >> ");
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
