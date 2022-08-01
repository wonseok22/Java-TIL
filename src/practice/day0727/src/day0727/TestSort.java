package day0727;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TestSort {
	public static void main(String[] args) {
		int[] arr = {4, 9, 2, 5, 1, 8, 7, 6, 3, 0};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(9);
		list.add(2);
		list.add(5);
		list.add(1);
		System.out.println(list);
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		});
		list.sort((o1,o2) -> {		
			return o1-o2;
		});
		List<Integer> li = new ArrayList<Integer>();
		li.add(4);
		li.add(9);
		li.add(2);
		li.add(5);
		li.add(1);
		System.out.println(li);
		Collections.sort(li);
		
		List<Bus> busList = new ArrayList<Bus>();
		busList.add(new Bus(27));
		busList.add(new Bus(56));
		busList.add(new Bus(33));
		busList.add(new Bus(9));
		busList.add(new Bus(100));
		Collections.sort(busList);
		System.out.println(busList);
		
		
		HashSet<Bus> hs = new HashSet<Bus>();
		hs.add(new Bus(10));
		hs.add(new Bus(25));
		hs.add(new Bus(33));
		hs.add(new Bus(15));
		hs.add(new Bus(79));
		hs.add(new Bus(54));
		hs.add(new Bus(54));
		System.out.println(hs);
		ArrayList<Bus> al = new ArrayList<Bus>(hs);
		Collections.sort(al);
		System.out.println(al);
		
		
		HashMap<Bus, Integer> hm = new HashMap<Bus, Integer>();
		hm.put(new Bus(30), 100);
		hm.put(new Bus(25), 1500);
		hm.put(new Bus(14), 1030);
		hm.put(new Bus(32), 10640);
		hm.put(new Bus(78), 550);
		hm.put(new Bus(52), 12100);
		
		System.out.println(hm);
		Set<Entry<Bus, Integer>> se = hm.entrySet();
		ArrayList<Entry<Bus,Integer>> all = new ArrayList<Entry<Bus, Integer>>(se);
		System.out.println(all);
		Collections.sort(all, new Comparator<Entry<Bus, Integer>>() {

			@Override
			public int compare(Entry<Bus, Integer> o1, Entry<Bus, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().num - o2.getKey().num;
			}
			
		});;
		System.out.println(all);
		List<String> names = new ArrayList<String>();
	}
}

class Bus implements Comparable<Bus> {
	int num;

	
	public Bus() {

	}


	public Bus(int num) {
		super();
		this.num = num;
	}

	
	@Override
	public String toString() {
		return "[" + num + "]";
	}


	@Override
	public int compareTo(Bus o) {
		// TODO Auto-generated method stub
		return this.num - o.num;
	}


	@Override
	public int hashCode() {

		return num;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (num != other.num)
			return false;
		return true;
	}

	
	
}