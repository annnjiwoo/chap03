package class26.exam03;

/**
 * 실행클래스 객체 생성 방식
 *  1. 빈객체 생성 후 값 저장 
 *  2. 객체 생성하면서 초기값 전달(값저장)
 */

public class EmployeeMain {
	public static void main(String[] args) {
		
		// 빈 객체 생성
		Employee em = new Employee();

		// 1.1 빈 객체의 필드에 값 저장
		em.empno = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;
		
		// 1.2 객체 정보 조회 (출력)
		System.out.println(em.empno+ em.eName+ em.position+ em.salary);
		System.out.println();


		// 2.1 오버로딩
		Employee em1 = new Employee(202101003, "김홍철", " 사원", -250);
		
		// 2.2 객체 정보 조회 (출력)
		System.out.println(em1.empno+" "+ em1.eName+" "+ em1.position+" "+ em1.salary);
		
		// 3. 객체 배열
		Employee[] emps = new Employee[3];	// Employee 객체만 담을 수 있음
		
		emps[0] = new Employee (202301001, "김수희","대리",310);
		emps[1] = new Employee (202301001, "박미선" , "사원", 280);
		emps[2] = new Employee (202301001,"최무림","과장", 400);
		System.out.println(emps[0].empno+" "+ emps[0].eName+" "+emps[0].position+" "+emps[0].salary);
		System.out.println(emps[1].empno+" "+ emps[1].eName+" "+emps[1].position+" "+emps[1].salary);
		System.out.println(emps[2].empno+" "+ emps[2].eName+" "+emps[2].position+" "+emps[2].salary);
		System.out.println();
		
		// 4. for문
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].empno+" "+ emps[i].eName+" "+ emps[i].position+" "+ emps[i].salary);
		}
		System.out.println();
		
		// 5. 향상된 for문
		for (Employee empss : emps) {
			System.out.println(empss.empno+" "+ empss.eName+" "+ empss.position+" "+  empss.salary);
		}
		
		// 6. 전 사원의 급여 총액 for문
		int empsum = 0;
		for (Employee sum : emps) {
			empsum += sum.salary;
		}
		System.out.println("전 사원의 급여 총액은 " + empsum + "입니다.");
		
		// 7. 전 사원의 급여 총액 향상 for문
		empsum = 0;
		for (int i = 0; i < emps.length; i++) {
			empsum += emps[i].salary;
		}
		System.out.println("전 사원의 급여 총액은 " + empsum + "입니다.");
	}

}
