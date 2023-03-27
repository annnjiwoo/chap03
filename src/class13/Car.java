package class13;

/**
 * 메소드 연습용 Car 클래스
 */

public class Car {

	// 필드 선언(기름)
	int gas;

	// 주유 메소드(리턴 값이 없는 메소드로 매개값을 받아서 gas 필드에 저장)
	void setGas(int gas) {
		this.gas = gas;
	}
	

	/**
	 * 기름이 있고 없고 여부를 반환해주는 메소드 - boolean : gas 필드값이 0이면 false, 0이 아니면 true를 리턴
	 */
	boolean isLeftGas() {// 뭐 물어볼 때 is나 exist를 붙인다.
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 호출한 쪽으로 값을 보내기 위한 false임, return문 만나면 false를 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다.");
		return true; // 호출한 쪽으로 값을 보내기 위한 true임, true 리턴하고 메소드 종료
	}

	
	/**
	 * 운행 메소드 
	 * - 기름이 0이 될 때까지 계속 운행 
	 * - gas가 0 이면 return 문으로 메소드를 종료시킴
	 * - 빠져나갈 때 break 아님 return 사용
	 * 
	 */
	void run() { //반환타입 없음 "void"
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 :" + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
