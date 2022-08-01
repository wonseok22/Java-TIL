package day0726;


/** 
 * 사용자 정의 예외
 * */

public class TestMyException {
	final int MAX_SIZE = 3;
	int[] arr = new int[MAX_SIZE];
	int index = 0;
	public static void main(String[] args){
		TestMyException tme = new TestMyException();
		try {
			tme.add(5);
			tme.add(4);
			tme.add(7);
			tme.add(9);
		} catch (ArrFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage() + "예외 발생");
			System.out.println("입력하려고 했던 데이터 : " + e.data);
			System.out.println("입력하려고 했던  시간 : " + e.time);
		}
		

		
	}
	
	public void add(int data) throws ArrFullException{
		// TODO Auto-generated method stub
		if (index < MAX_SIZE) {
			System.out.println(data + "를 배열에 추가 : " + index + "번 인덱스");			
			arr[index++] = data;
		} else {
			ArrFullException afe = new ArrFullException("배열이 가득찼습니다.");
			afe.data = data;
			afe.time = System.currentTimeMillis();
			throw afe;
		}
	}
}

class ArrFullException extends Exception {
	int data;
	long time;
	public ArrFullException(String message) {
		super(message);
	}
}