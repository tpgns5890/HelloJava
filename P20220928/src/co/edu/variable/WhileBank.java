package co.edu.variable;

import java.util.Scanner;

public class WhileBank {

	public static void main(String[] args) {
		bankApp();
	}

	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		// 메뉴 : 1:예금, 2:출금, 3:잔고, 4:종료
		while (run) {
			System.out.println("메뉴 : 1:예금, 2:출금, 3:잔고, 4:종료");
			int menu = scn.nextInt();

			switch (menu) {
			case 1:
				System.out.println("예금처리하는 메뉴");
				System.out.println("예금액을 입력>>> ");
				int input = scn.nextInt();
				money += input;
				if (money > 100000) {
					System.out.println("잔고는 100,000원을 넘을 수 없습니다.");
					money -= input;
				}
				break;
			case 2:
				System.out.println("출금처리하는 메뉴");
				System.out.println("출금액을 입력>>> ");
				int output = scn.nextInt();
				money -= output;
				if (money < 0) {
					System.out.println("잔액이 부족합니다.");
					money += output;
				}
				break;
			case 3:
				System.out.println("잔고조회하는 메뉴");
				System.out.println("현재 잔고는 :" + money + "원");
				break;
			case 4:
				System.out.println("종료하는 메뉴");
				run = false;
			}

		} // end of while
		System.out.println("end of program");
	} // end of bankApp
} // end of class
