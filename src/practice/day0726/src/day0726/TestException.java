package day0726;

public class TestException {
	public static void main(String[] args) {
		TestException te = new TestException();
		System.out.println("main 시작");
		te.a();
		System.out.println("main 종료");
	}

	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a 시작");
		b(0);
		System.out.println("a 종료");
	}
	public void b(int m) throws ArithmeticException{
		// TODO Auto-generated method stub
		System.out.println("b 시작");
		int x = 3 / m;  // ArithmeticException : 정수의 나눗셈에서 0으로 나누었을 때  ERROR (divided by zero)						
//		try {
//			int x = 3 / m;  // ArithmeticException : 정수의 나눗셈에서 0으로 나누었을 때  ERROR (divided by zero)						
//		} catch(ArithmeticException e) {
//			System.out.pr	intln("0으로 나눌 수 업습니다.");
//		}
		System.out.println("b 종료");
	}
}


/*
  
main 시작
a 시작
b 시작
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day0726.TestException.b(TestException.java:20)
	at day0726.TestException.a(TestException.java:14)
	at day0726.TestException.main(TestException.java:7)

 */
 