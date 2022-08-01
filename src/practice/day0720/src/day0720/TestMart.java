package day0720;

class Mart{
	String name;
	int ball;
	int pen;
	
	Mart() {
		
	}
	
	Mart(String name) {
		this.name = name;
	}
	
	Mart(String name, int ball, int pen) {
		this.name = name;
		this.ball = ball;
		this.pen = pen;
	}
	

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getBall() {
		return ball;
	}

	void setBall(int ball) {
		this.ball = ball;
	}

	int getPen() {
		return pen;
	}

	void setPen(int pen) {
		this.pen = pen;
	}

	void sale() {
//		10% 할인
		System.out.println();
	}
	void sale(double percent) {
//		percent 할인
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Mart [name=" + name + ", ball=" + ball + ", pen=" + pen + "]";
	}
}
 
public class TestMart {
	public static void main(String[] args) {
		Mart first = new Mart();
		Mart second = new Mart("투");
		Mart third = new Mart("쓰리", 100, 50);
		
		System.out.println("첫 번째 상품 name : " + first.getName() + " ball : " + first.getBall() + " pen : " + first.getPen() );
		System.out.println("두 번째 상품 name : " + second.getName() + " ball : " + second.getBall() + " pen : " + second.getPen() );
		System.out.println("세 번째 상품 name : " + third.getName() + " ball : " + third.getBall() + " pen : " + third.getPen() );
		
		
	}
}

