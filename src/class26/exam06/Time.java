package class26.exam06;

public class Time {
	// 필드
	public int hour ; 
	public int minute;
	public int second;
	
	//기본생성자
	public Time() {
	}
	
	//오버로딩 생성자
	public Time (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//객체의 내부 정보를 보여주는 메소드
	public void showTime() {
		System.out.println("현재 시간은 : " + this.hour + "시 " + this.minute + "분 "+this.second + "초 입니다.");
	}

}
