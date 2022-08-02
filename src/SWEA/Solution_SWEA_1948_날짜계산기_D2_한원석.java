package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
public class Solution_SWEA_1948_날짜계산기_D2_한원석 {
	
	    public static void main(String args[]) throws Exception
	    {
	      
	        Scanner sc = new Scanner(System.in);
	        int TC = sc.nextInt();
	        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	        for(int testCase = 1; testCase <= TC; testCase++)
	        {
	            int m1 = sc.nextInt();
	            int d1 = sc.nextInt();
	            int m2 = sc.nextInt();
	            int d2 = sc.nextInt();
	            int answer = d2-d1+1;
	            for (int i = m1; i < m2; i++) {
					answer += month[i];
				}
	            System.out.printf("#%d %d\n", testCase, answer);
	        }
	    }
	}
