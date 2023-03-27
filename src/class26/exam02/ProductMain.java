package class26.exam02;

public class ProductMain {
	public static void main(String[] args) {
		
		//	기본생성자 
		Product pro1 = new Product();
		pro1.id = 202103001;
		pro1.name= "냉장고";
		pro1.price = 500;
		pro1.quantity = 5;
		
		
		pro1.showProductInfo();
		
		//오버로딩생성자(파라미터)
		Product pro2 = new Product(202103001,"세탁기", 250, -15);
		
		System.out.println();
		pro2.showProductInfo();
		
	}

}
