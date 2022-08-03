package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Solution_SWEA_1928_Base64Decoder_D2_한원석{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			String S = br.readLine();
			Decoder decoder = Base64.getDecoder();
			byte[] decode = decoder.decode(S.getBytes());
			System.out.println("#" + testCase + " " + new String(decode));
		}
	}
}
