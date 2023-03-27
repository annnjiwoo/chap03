package class26.exam01;
/**
 * 빈객체를 만들고 필드에 직접 접근
 * 생성자를 사용해서 출력하기
 */

public class CarMain { //생성자를 사용해서 출력하기
	public static void main(String[] args) {
		// 첫번째 자동화 객체 생성 (생성과 동시에 값 저장)
		Car myCar = new Car("현대차","그랜저",2000,"white",2500000,250,-100);
		System.out.println(myCar.maker);
		System.out.println(myCar.model);
		System.out.println(myCar.cc);
		System.out.println(myCar.color);
		System.out.println(myCar.price);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println();
		
		
		//두번째 자동화 객체 생성
		Car myCar2 = new Car (); 
		
		//빈객체를 만들고 필드에 직접 접근
		myCar2.maker = "기아차";
		myCar2.model = "k9";
		myCar2.cc = 3000;
		myCar2.color = "black";
		myCar2.price = 350000000;
		myCar2.maxSpeed = 150;
		myCar2.speed = 100;
		System.out.println(myCar2.maker);
		System.out.println(myCar2.model);
		System.out.println(myCar2.cc);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.maxSpeed);
		System.out.println(myCar2.speed);
		System.out.println();
		
		//자동차 객체의 값출력하는 또다른 방법(showCarInfo 메소드)
		//첫번재 자동화 객체의 값추력
		myCar.showCarInfo();
		System.out.println();
		
		//두번째 자동화 객체의 출력
		myCar2.showCarInfo();
	}

}
