package class27;

public class CarMain {
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50); //// private으로 필드 선언하였기때문에 메소드에 직접 값을 준다
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
