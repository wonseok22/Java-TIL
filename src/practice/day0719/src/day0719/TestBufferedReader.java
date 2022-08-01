package day0719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestBufferedReader {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String s = br.readLine();
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println();
	
	}
}
