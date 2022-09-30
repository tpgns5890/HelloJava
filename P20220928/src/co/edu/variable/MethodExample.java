package co.edu.variable;

public class MethodExample {
//	가로, 세로 = > 넓이 
	public static int getArea(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

//	배열요소의 각 값의 합
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}

//	두 수를 나눈 결과를 반환
	public static double divide(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}

	// 두수를 나누는 작업.
	public static double divide(int n1, int n2) {
//		1bit * 8 => 1byte.
//		유형 : byte(1), short(2), int(4), long(8)
//			: float(4), double(8)
		if(n2==0) {
			return 0;
		}
		double result = (double) n1 / n2;
		return result;
	}

	public static void main(String[] arg) {
		int result = getArea(20, 15);
		System.out.println("전체 너비는 " + result);

		int[] intAry = { 23, 45, 12 };
		result = sumAry(intAry);
		System.out.println("전체 배열요소의 합계는 " + result);

		int[] intAry2 = { 22, 33, 44, 55 };
		result = sumAry(intAry2);
		System.out.println("전체 배열요소의 합계는 " + result);

//		실수, float, double
		double d1 = 23.4567;
		double d2 = 12.34;
		double d3 = d1 + d2;

		d3 = divide(d1, d2);
		System.out.println("두 수를 나눈 결과는 " + d3);

		d3 = divide(3, 2);
		System.out.println("두 수를 나눈 결과는 " + d3);
	}

}
