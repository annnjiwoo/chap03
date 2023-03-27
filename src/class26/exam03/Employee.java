package class26.exam03;
/**
 * 사원 클래스 모델링 (설계) 연습
 * 사원 클래스의 필드는 다음과 같다.
 */

public class Employee {
	
	// 인스턴스 멤버 (필드) 선언 영역
	public int empno;		//사원번호
	public String eName;	//사원명
	public String position;	//직급
	public int salary;		//급여
	
	public Employee() {
	}
	
	//생성자 오버로딩
	//객체를 생성하면서 인자를 전달받고 그 값으로 객체 초기화
	//this : 현재 객체 자신을 가리킴
	
	public Employee(int empno, String eName,String position,int salary  ) {
		this.empno=empno;
		this.eName=eName;
		this.position=position;
		this.salary=salary;
	}

}
