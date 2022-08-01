package collection.frameworkClass;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(8);
		hs.add(1);
		hs.add(9);
		System.out.println(hs);
		Set<MyCar> s = new HashSet<MyCar>();
		s.add(new MyCar(1004));
		s.add(new MyCar(1234));
		s.add(new MyCar(1004));
		s.add(new MyCar(500));
		System.out.println(s);
	}
}


class MyCar {
	int number;
	public MyCar() {
		// TODO Auto-generated constructor stub
	}
	public MyCar(int number){
		this.number = number;
	}
	@Override
	public String toString() {
		return "[" + number + "]";
	}
//	@Override
//	public int hashCode() {
//		return number;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) return false;
//		if (!(obj instanceof MyCar))return false;	
//		MyCar mc = (MyCar) obj;
//		if (this.number != mc.number) return false;
//		return true;
//	}
//	
	
}