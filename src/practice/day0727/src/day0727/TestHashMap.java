package day0727;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Cup, Integer> ch = new HashMap<Cup, Integer>();

		ch.put(new Cup("배트맨"), 300000);
		ch.put(new Cup("슈퍼맨"), 10000);
		ch.put(new Cup("원더우먼"), 30000);
		System.out.println(ch.get(new Cup()));
		
	}
}
