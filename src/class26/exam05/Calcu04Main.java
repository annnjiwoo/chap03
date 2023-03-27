package class26.exam05;
/**
 *   - 오버로딩 메소드에 파라미터로 배열을 전달받아서 +10해서 배열 반환해줌
 */

public class Calcu04Main {
	public static void main(String[] args) {
		int [] intArr = new int[5];
		intArr [0] = 15;
		intArr [1] = 25;
		intArr [2] = 35;
		intArr [3] = 45;
		intArr [4] = 55;
		
		double[] dblArr = new double[5];
		dblArr [0] = 15.5;
		dblArr [1] = 25.5;
		dblArr [2] = 35.5;
		dblArr [3] = 45.5;
		dblArr [4] = 55.5;
		
		// 계산기 객체 생성
		Calcu04 cal = new Calcu04();
		
		//계산기 객체의 오버로딩 메소드 호출
		int[] arr2 = cal.tenPlus(intArr);
		double[] arr3 = cal.tenPlus(dblArr);
		
		// 두 배열 값을 출력하세요.
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}System.out.println();
		
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
