package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_SWEA_1228__암호문1_D3_한원석 {
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
	for (int testCase = 1; testCase <= 10; testCase++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                list.add(Integer.parseInt(st.nextToken()));
            int command = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < command; i++) {
            	String check = st.nextToken();
            	if (check.equals("I")) {
                    int index =  Integer.parseInt(st.nextToken());
                    int count =  Integer.parseInt(st.nextToken());
                    for (int j = index; j < index + count; j++) {
                        list.add(j, Integer.parseInt(st.nextToken()));
                    }
            	}
            }
            System.out.print("#" + testCase + " ");
            for (int i = 0; i < 10; i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
        }
	}
}
