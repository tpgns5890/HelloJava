package co.edu.variable;

public class MethodCalender {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			makeCal(i); // 호출.
			System.out.println();
			System.out.println();
		}
	}

	public static void makeCal(int month) {
		System.out.println("        >>>> " + month + "월<<<<");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
//		요일 출력
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();

//		1일의 위치 지정
		for (int i = 0; i < getFirstDay(month); i++) {
			System.out.printf("%4s", " ");
		}
//		날짜 출력
		for (int i = 1; i <= getLastDate(month); i++) {
			System.out.printf("%4d", i);
			if ((i + getFirstDay(month)) % 7 == 0) {
				System.out.println();
			}
		}
	} // end of makeCal()

	public static int getFirstDay(int month) {
		if (month == 1) {
			return 6;
		} else if (month == 2) {
			return 2;
		} else if (month == 3) {
			return 2;
		} else if (month == 4) {
			return 5;
		} else if (month == 5) {
			return 0;
		} else if (month == 6) {
			return 3;
		} else if (month == 7) {
			return 5;
		} else if (month == 8) {
			return 1;
		} else if (month == 9) {
			return 4;
		} else if (month == 10) {
			return 6;
		} else if (month == 11) {
			return 2;
		} else {
			return 4;
		}
	} // end of getFirstDay

	public static int getLastDate(int month) {
		// switch...case..구문.
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		default:
			return 30;
		}

	} // end of getLastDate
} // end of class