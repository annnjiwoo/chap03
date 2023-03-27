package class10;
/**
 * this() : 다른 생성자를 호출할 때 사용함.
 */

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car(String model) {
		// 다른 생성자 호출
		this(model, "은색", 250); // 생성자의 첫 줄에 작성
		// this의 인자가 세개면, 동일한 파라미터 유형의 객체로 초기화됨
		//	=> 맨아래 동일유형의 파라미터가 있기때문에,결국 인자 모두를 출력할 수 있음
	}

	Car(String model, String color) {
		// 다른 생성자 호출
		this(model, color, 250); // 생성자의 첫 줄에 작성
	}

	Car(String model, String color, int maxSpeed) {
		// 다른 생성자 호출
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
