package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = { 34, 21, 64 };

//		반복적인 처리.
//		결과 : numAry = {12,21,34}
//		케이스 : n1 > n2 > n3 => 
//		케이스 : n1 < n2 > n3 =>

		if (numAry[0] > numAry[1]) { // 34>21
			int temp = numAry[0];
			numAry[0] = numAry[1]; // 21
			numAry[1] = temp;
		}
		if (numAry[0] > numAry[2]) {
			int temp = numAry[0];
			numAry[0] = numAry[2];
			numAry[2] = temp;
		}

		if (numAry[1] > numAry[2]) {
			int temp = numAry[1];
			numAry[1] = numAry[2];
			numAry[2] = temp;
		}
		for (int n : numAry) {
			System.out.println(n);
		}
	}
}
