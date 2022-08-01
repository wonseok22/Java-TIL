package collection.frameworkClass;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hi");
		al.add("hello");
		al.add("world");
		al.add("bye");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}
}
