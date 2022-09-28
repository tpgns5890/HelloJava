package co.edu.variable;

// 자바는 class로부터 시작. 반드시 정의해야 함
// 어떤 클래스든, 클래스의 main메소드로부터 시작.

public class App {
	public static void main(String[] args) {
		System.out.println("매개값을 출력."); //매개값을 출력. 자바스크립트의 콘솔 로그
		
		//변수의 타입을 꼼꼼히 체크해서 선언해야함 => 정수(int, long), 실수(double, float)
		// 									참/거짓(boolean), 문자열(String)
		
		int myAge = 25; //오른쪽 = 왼쪽 타입 항상 동일.
//		myAge = "스물다섯"; //컴파일 에러
		String 내나이 = "스물다섯";
		내나이 = "28"; //문자열 28.
		
		int result = myAge + 30;
		System.out.println(myAge + "값과 30을 더하면 " + result + "입니다.");
		
		//배열.
		//자바스크립트에선 let numArr = [];
		int[] numAry = {20, 29, 13, 44, 88, 33};	//배열 선언
		int sumOdd = 0;
		int sumEven = 0;
//		1) 배열의 합계.
		for(int i=0; i<6; i++) {
//			System.out.println(numAry[i]);
			if(i%2 == 0) {	//홀수번째 값 합계
				sumEven += numAry[i];
			}
			else {
				sumOdd += numAry[i];
			}
		}
		System.out.println("짝수번째 값의 합은 " + sumOdd + " 홀수번째 값의 합은 " + sumEven);
		
//		2)배열 조건.
		int sum = 0;	//0값으로 초기화. 문제 : sum의 값이 100을 넘어서는 시점 break;
		for(int i=0; i<6; i++) {		
			sum += numAry[i];
			if(sum > 100) { //sum의 값이 100을 초과할 때.
				break;
				
			}
		}
		System.out.println("브레이크 후 sum의 값은 " + sum);
	}	
}
