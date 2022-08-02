package practice.day0719.src.day0719;
import java.io.*;  
import java.util.StringTokenizer;
public class  prblem01 {  
    public static void main(String args[])throws Exception{    
          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));    
          int[] dx = {-1,1,0,0,1,1,-1,-1};
          int[] dy = {0,0,-1,1,-1,1,-1,1};
          
          int TC = Integer.parseInt(br.readLine());
          for (int tc = 1; tc <= TC; tc++) {
        	  int answer = 0;  	  
        	  int N = Integer.parseInt(br.readLine());
        	  String[][] city = new String[N][N];
        	  for (int i = 0; i < N; i++) {
        		  StringTokenizer st = new StringTokenizer(br.readLine());
        		  	for (int j = 0; j < N; j++) {
        		  		city[i][j] = st.nextToken();
  					}
        	  }
        	  for (int i = 0; i < N; i++) {
        		  for (int j = 0; j < N; j++) {
        			  boolean changed = false;
//        			  System.out.println(city[i][j]);
        			  if(city[i][j].equals("B")) {
//        				  System.out.println("test!!");
        				  for (int d = 0; d < 8; d++) {
							int ax = i + dx[d];
							int ay = j + dy[d];
							if (0 <= ax && ax < N && 0 <= ay && ay < N && city[ax][ay].equals("G")) {
								changed = true;
								if (answer < 2) answer = 2;
								break;
							}
        				  }
        				  if(!changed) {
        					  int cnt = -1;
        					  for (int k = 0; k < N; k++) {
								if (city[i][k].equals("B")) cnt ++;
								if (city[k][j].equals("B")) cnt ++;
        					  }
        					  if(answer < cnt) answer = cnt;
        				  }
        			  }
        		  }
        	  }
        	  
        	  System.out.printf("#%d %d\n",tc,answer);
          }
		}
              
}    	
