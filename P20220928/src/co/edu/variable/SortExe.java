package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = { 34, 21, 12, 6, 1, 4, 3, 5, 7, 8, 9, 0, 11, 13 };

//		반복적인 처리.
//		결과 : numAry = {12,21,34}
//		케이스 : n1 > n2 > n3 => 
//		케이스 : n1 < n2 > n3 =>
		for (int j = 0; j < numAry.length - 1; j++) {
			for (int i = 0; i < numAry.length - 1; i++) {
				if (numAry[i] > numAry[i + 1]) {
					int temp = numAry[i];// 순서가 먼저 있는 값을 temp.
					numAry[i] = numAry[i + 1]; // 21
					numAry[i + 1] = temp;
				}
			}
		}
//		if (numAry[0] > numAry[2]) {
//			int temp = numAry[0];
//			numAry[0] = numAry[2];
//			numAry[2] = temp;
//		}
//		if (numAry[0] > numAry[3]) {
//			int temp = numAry[0];
//			numAry[0] = numAry[3];
//			numAry[3] = temp;
//		}
//		
//		if (numAry[1] > numAry[2]) {
//			int temp = numAry[1];
//			numAry[1] = numAry[2];
//			numAry[2] = temp;
//		}
//		if (numAry[1] > numAry[3]) {
//			int temp = numAry[1];
//			numAry[1] = numAry[3];
//			numAry[3] = temp;
//		}
//		if (numAry[2] > numAry[3]) {
//			int temp = numAry[2ㄴ];
//			numAry[2] = numAry[3];
//			numAry[3] = temp;
//		}
//		순서출력
		for (int n : numAry) {
			System.out.print(n + " ");
		}
	}
}
