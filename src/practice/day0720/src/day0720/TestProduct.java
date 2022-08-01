package day0720;

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	
	}
}

class Product {
	static int num = 100000;
	int sn;
	String test;
	static String t = "tt";
	

	public Product() {
		this.sn = num++;
		this.test = t;
		t = "abd";
	}
	
	@Override
	public String toString() {
		return "sn:" + this.test;
	}
}