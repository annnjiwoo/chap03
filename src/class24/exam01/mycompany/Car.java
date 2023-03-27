package class24.exam01.mycompany;

import class24.exam01.hyundai.Engine;
import class24.exam01.hankook.SnowTire;
import class24.exam01.kumho.BigwidthTire;
import class24.exam01.kumho.Tire;


public class Car { // 라이브러리 클래스
	Engine engine = new Engine();	
	// 컴파일러야, Car 클래스에 Engine이 없으니 import를 통해 찾아와! (Math 등 제외. java.lang에 들어가있어서)
	SnowTire tire1 = new SnowTire();
	BigwidthTire tire2 = new BigwidthTire();
	
	
	Tire tire10 = new Tire();	// 결과 kumho
	Tire tire11 = new Tire();	// 결과 kumho / hankook 패키지의 Tire를 쓰려면 아래와 같이 복잡한 과정을 거쳐야함
	
	class24.exam01.kumho.Tire tire3 = new class24.exam01.kumho.Tire();
	class24.exam01.hankook.Tire tire4 = new class24.exam01.hankook.Tire();
	
	public static void main(String[] args) {
		//static 때문에 실질적으로 Car에 속하지 않음
		Car myCar = new Car();
		// 때문에 Car 객체를 선언해줘야 함.
	}
	

}
