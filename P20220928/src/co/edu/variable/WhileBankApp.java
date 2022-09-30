package co.edu.variable;

import java.util.Scanner;

//	계좌정보 선언: 계좌번호, 예금주, 잔고
//	은행 계좌 생성: Account[] banks;
public class WhileBankApp {
	public static void main(String[] args) {
//		메뉴: 1:예금, 2:출금, 3:잔액조회, 4:종료
		Account[] banks = new Account[10];

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("0:계좌생성, 1:예금, 2:출금, 3:잔액조회, 4:종료");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
//				예금기능. 계좌번호, 얼마.

				System.out.println("계좌번호>>> ");
				String accNo = scn.nextLine();
				System.out.println("예금할 금액>>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						banks[i].getBalance() += money;
						if (banks[i].getBalance() > 100000) {
							System.out.println("더 이상 입금하실 수 없습니다.");
							banks[i].balance = banks[i].getBalance() - money;
							break;
						}
						System.out.println(accNo + " 계좌에 " + money + "원 입금이 완료되었습니다.");
					}
					if (banks[i] != null && banks[i].getAccNo().contains(accNo) == false) {
						System.out.println("존재하지 않는 계좌번호입니다.");
					}
				}

			} else if (menu == 2) {
//				출금기능. 계좌번호, 얼마.
				System.out.println("계좌번호>>> ");
				String accNo = scn.nextLine();
				System.out.println("출금할 금액>>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						banks[i].getBalance = banks[i].getBalance() - money;
						if (banks[i].getBalance() < 0) {
							System.out.println("잔액이 부족합니다.");
							banks[i].getBalance() = banks[i].getBalance() + money;
							break;
						}
						System.out.println(accNo + " 계좌에 " + money + "원 출금이 완료되었습니다.");
					}
				}
			} else if (menu == 3) {
//				잔액조회
				System.out.println("조회할 계좌번호 입력>>> ");
				String accNo = scn.nextLine();
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						System.out.println("잔액: " + banks[i].getBalance());
					}
				}
			} else if (menu == 4) {
//				종료
				System.out.println("종료합니다.");
				scn.close();
				break;

			} else if (menu == 0) {
//				계좌번호 생성
				System.out.println("계좌번호 입력>>> ");
				String accNo = scn.nextLine();
				System.out.println("예금주명 입력>>> ");
				String owner = scn.nextLine();

				Account acc = new Account(); // 인스턴스 생성.
				acc.setAccNo(accNo);
				acc.setOwner(owner);

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] == null) {
						// 한 건 입력. 반복문 빠져나오기
						banks[i] = acc;
						break;
					}
				}
				System.out.println("계좌 생성이 완료되었습니다. (계좌번호 : " + accNo + ", 예금주: " + owner + ")");
			}

		} // end of while

	} // end of main
} // end of WhileBankApp
