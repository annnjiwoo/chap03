package class02;

/*
 * ����Ŭ����
 *  - main �޼ҵ尡 �־ ������ �� �ִ� Ŭ����
 *  - ���̺귯�� Ŭ������ ��ü�� ���� �̿��ϴ� Ŭ����
 *  - ���⿡ Ŭ������ �׳� ��� ��, ������ Car.java
 */

public class CarMain {
	public static void main(String[] args) {
		//Car Ŭ���� ��ü ����
		
		Car myCar=new Car(); //new �����ڸ� ���ؼ� ��ü ����
		
		myCar.color = "������"; // �������� ���� (���� �ʵ忡 �� �Ҵ�)
		
		System.out.println("�ڵ����� ������ : " +myCar.color + "�Դϴ�."); //��Ʈ������
	}

}
