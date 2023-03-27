package class21;

/**
 * 한지붕 세가족 
 * - simulate()와 main()메소드는 Car클래스 안에 있지만 Car클래스의 것이 아니다.
 *   왜냐하면 정적메소드이기 때문이다. 
 * - 정적 메소드 안에서는 Car 객체의 멤버인 speed 필드에 접근할 수 없다. 
 *   this도 사용할 수 없다. 
 *   접근하려면 Car객체를 생성해서 접근해야 한다.
 */

public class Car {
	// 인스턴스 필드 선언(객체 생성시 따라감)
	int speed;

	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + " 으로 달립니다.");
	}

	// 정적(static)메소드
	static void simulate() {
		// 객체 생성
		Car myCar = new Car(); // 인스턴스 필드에 접근하기 위한 객체 생성임
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}

	// 정적(static)메소드
	public static void main(String[] args) {
		// main이 있어야 JVM이 실행시켜줌, static이 있어 객체생성하지 않아도 실행 가능함

		// 정적 메소드 호출
		simulate();	// static인 메소드를 호출하려면 둘다 staric 메소드여야함

		// 객체 생성
		Car myCar = new Car(); // 인스턴스 필드에 접근하기 위한 객체 생성임
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}

}
