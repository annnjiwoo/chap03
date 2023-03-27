package class17;

/**
 * 라이브러리 클래스
 */

public class Calculator {

	// 원주율
	double pi = 3.14159;

	// 넓이 구하는 메소드 (원주율*반지름*반지름)
	double area(int radius) {
		return this.pi * radius * radius;
	}

}
