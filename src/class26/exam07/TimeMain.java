package class26.exam07;


public class TimeMain {
	public static void main(String[] args) {
		// Time 객체 생성
		Time t = new Time();
		t.setHour(16); // private으로 필드 선언하였기때문에 메소드에 직접 값을 준다
		t.showTime();

	}

}
