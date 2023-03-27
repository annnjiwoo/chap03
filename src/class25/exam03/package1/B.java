package class25.exam03.package1;

public class B {
	public void method() {
		//객체 생성
		A a = new A();	// A클래스타입의 a의 변수  = 생성자는 A로 호출
		
		//필드값 변경
		a.field1 = 1;		//o
		a.field2 = 1;		//o
		//a.field3 = 1;		//x
		
		//메서드 호출
		a.method1(); 		//o
		a.method2(); 		//o
		//a.method3();		//x
	}

}
