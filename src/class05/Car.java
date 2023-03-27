package class05;
/*
 * 라이브러리 클래스, 도메인 클래스
 * 또다른 생성자를 만듦 - 기본 생성자 안만들어줌
 */

public class Car {

	// 필드(멤버변수)
	String color;

	// 또다른 생성자
	Car(String co) { // () 괄호안에는 파라미터 라고함..
		color = co;	// color는 필드
		System.out.println("여기는 또다른 생성자입니다.");
	}
	
	//기본생성자
	 Car() {
		
	}
}
