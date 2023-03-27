package class26.exam01;

public class Car {

	// 필드 지정 (멤버변수, 인스턴스변수)
	String maker;
	String model;
	int cc;
	String color;
	int price;
	int maxSpeed;
	int speed;

	// 기본생성자
	public Car() {// 항상 만들면 조와,,
	}

	// 오버로딩(파라미터)
	//	- 파라미터로 받은 값으로 필드 초기화
	public Car(String maker, String model, int cc, String color, 
				int price, int maxSpeed, int speed) {
		this.maker = maker;
		this.model = model;
		this.cc = cc;
		this.color = color;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	public void showCarInfo() {
		System.out.println("maker : "+ this.maker);
		System.out.println("model : " + this.model);
		System.out.println("cc : " + this.cc);
		System.out.println("color : " + this.color);
		System.out.println("price : " + this.price);
		System.out.println("maxSpeed : " + this.maxSpeed);
		System.out.println("speed : " + this.speed);
		
	}

}
