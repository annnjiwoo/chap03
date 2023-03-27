package class26.exam04;

public class StudentMain {
	public static void main(String[] args) {
	
		
		Student[] stu = new Student[5];
		int sum = 0;
		int best = 0;
		String first = "";
		stu[0] = new Student("김홍철" , 23, "남", "010-2340-1233",85);
		stu[1] = new Student("정순미" , 24, "여", "010-9857-7532",70);
		stu[2] = new Student("이만섭" , 22, "남", "010-6548-4687",96);
		stu[3] = new Student("최주호" , 20, "남", "010-2528-9368",85);
		stu[4] = new Student("고미림" , 26, "여", "010-1068-2549",77);
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name + "\t" + stu[i].age + "\t" + stu[i].gender 
					+ "\t" + stu[i].phone + "\t" +stu[i].score );
		}
		
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].score;
			if (stu[i].score>best) {
				best = stu[i].score;
				first = stu[i].name;
			}
		}
		System.out.println("총인원 : " + stu.length);
		System.out.printf("평균점수는 : %.1f" , (double)sum/stu.length);
		System.out.println();
		System.out.println("최고점수는 : " + best);
		System.out.println("최고득점자 : " + first);
		//향상된 for문
		sum = 0;
		best = 0;
		first = "";
		for (Student std : stu) {
			System.out.println(std.showStudentInfo());
			sum+=std.score;
			if (std.score>best) {
				best = std.score;
				first=std.name;
			}
		}
		System.out.println("총인원 : " + stu.length);
		System.out.printf("평균점수는 : %.1f" , (double)sum/stu.length);
		System.out.println();
		System.out.println("최고점수는 : " + best);
		System.out.println("최고득점자 : " + first);
		
	}

}
