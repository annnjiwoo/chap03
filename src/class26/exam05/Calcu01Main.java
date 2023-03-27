package class26.exam05;
/**
 * 메소드 오버로딩
 * 실행클래스
 */

public class Calcu01Main {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		double x1= 10.5;
		double y1= 20.0;
		
		//계산기 객체 생성
		Calcu01 calculator = new Calcu01();
		
		//정수 합산
		int intSum = calculator.sum(x, y);
		System.out.printf("정수 %d와 %d의 합산 결과는 %d 입니다.", x,y,intSum );
		System.out.println();
		//실수 합산
		double doubleSum = calculator.sum(x1, y1);
		System.out.printf("실수 %.1f와 %.1f의 합산 결과는 %.1f 입니다.", x1,y1,doubleSum );
	}

}
