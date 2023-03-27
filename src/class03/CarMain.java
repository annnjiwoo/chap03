package class03;
/*
 * 실행클래스
 * - 객체 생성과 필드의 사용(필드 값에 저장)
 * - 필드의 자료형이 가지는 기본 값으로 자동 초기화 된다.
 */
public class CarMain {
	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();	//new+Car()가 만나 기본 생성자 호출 (초기화 된 상태로)
		// myCar는 클래스변수, 참조변수, 타입변수 라고 함
		// new는 메모리에 올려주는 역할(객체 생성의 역할)
		
		//필드의 초기값 읽기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최고속도(int) : " + myCar.maxspeed);
		System.out.println();
		
		//myCar 객체의 필드에 값저장
		myCar.model = "제네시스";	// 클래스변수.필드명에 할당해 줌 (도트연산자 사용)
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.start = true;
		myCar.maxspeed = 300;
		
		//myCar 객체에 저장한 필드값 조회하기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최고속도(int) : " + myCar.maxspeed);
	}
}
