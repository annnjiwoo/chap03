package class26.exam02;


public class Product {
	public int id;
	public String name;
	public int price;
	public int quantity;
	public int amout;
	

	// 기본생성자
	public Product() {
	}

	// 오버로딩 생성자
	public Product(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//어마운트 계산
	public int getAmount() { //void가 없기때문에 리턴타입
		return this.price * this.quantity;
	}
	
	public void showProductInfo() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("price : " + price);
		System.out.println("quantity : " + quantity);
		System.out.println("amout : " + getAmount());	//getAmount 메서드(동작)로 불러오기
		
	}

}
