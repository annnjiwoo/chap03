package class26.exam05;

/**
 * [메소드 오버로딩]
 */

public class Calcu03 {

	// 덧셈 (정수)
	public int sum(int x, int y) {
		return x + y;	//3번 호출
	}

	// 덧셈(실수)
	public double sum(double x, double y) {
		return x + y;
	}

	// 정수 평균 구하는 메소드
	public double avg(int x, int y) {
		int sum = 0;
		double avg = 0.0;
		sum = sum(x,y);	// 평균을 구하기 위한 sum 메소드 호출
		avg = (double) sum / 2;
		return avg;
	}

	// 실수 평균 구하는 메소드
	public double avg(double x, double y) {
		double sum = 0.0;
		double avg = 0.0;
		sum = sum(x,y);	// 2번호출, 평균을 구하기 위한 sum 메소드 호출
		avg = (double) sum / 2;
		return avg;
	}

	// 정수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void excute(int x, int y) {
		double avg = 0.0;
		avg = avg(x, y);	// 1번 호출
		System.out.println(x + " + " + y + "  평균은 " + avg);
	}

	// 실수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void excute(double x, double y) {
		double avg = 0.0;
		avg = avg(x, y);
		System.out.println(x + " + " + y + "  평균은 " + avg);
	}

	// 계산된 평균을 출력해주는 메소드

}
