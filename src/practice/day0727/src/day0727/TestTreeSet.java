package day0727;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		
		TreeSet<YourCar> ts = new TreeSet<YourCar>();
		ts.add(new YourCar(4, "김연아"));
		
	}

}

class YourCar implements Comparable<YourCar>{
	int number;
	String name;
	public YourCar() {
		
	}
	YourCar(int number, String name){
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "["+ name + "," + number + "]";
	}
	@Override
	public int compareTo(YourCar other) {
		// TODO Auto-generated method stub
		return this.number - other.number;
	}

	
	
}