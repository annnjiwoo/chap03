package class26.exam07;

public class Time {
	// 필드
	private int hour;	// private은 값을 바로 할당할 수 없다.
	private int minute;	// 메소드를 통해 전달
	private int second;
	
	//시간값 세팅 메소드 (setter 메소드)
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("시간 값이 올바르지 않습니다.");
			return;
		}
		this.hour = hour;
	}

	public void showTime() {
		System.out.println("현재 시간은 : " + this.hour + "시입니다.");
	}

}
