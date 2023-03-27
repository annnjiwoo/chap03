package class14;
/**
 * 메소드 오버로딩 연습 라이브러리 클래스
 */

public class PlusCalculator { //PlusCalculator : 클래스
	
	//정수 덧셈 메소드
	int plus(int x, int y) {//int : 메서드
		int result = x+y;
		return result;// 리턴값 지정
	}
	
	//실수 메소드
	double plus (double x, double y) {//double : 메서드
		double result = x+y;
		return result; // 리턴값 지정
	}

}
