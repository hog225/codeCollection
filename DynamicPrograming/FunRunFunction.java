
import java.util.*;
import java.io.*;

public class FunRunFunction { // Main
  //백준 9184
  static int mem[][][] = new int[21][21][21];
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
  
  static int w(int a, int b, int c){
    if (inRange(a, b, c) && mem[a][b][c] != 0)
      return mem[a][b][c];
    
    if (a<=0 || b<=0 || c<=0){
      return 1;
    }
    if (a>20 || b > 20 || c>20){
      mem[20][20][20] = w(20, 20, 20);
      return mem[20][20][20];
    }
      
    if (a < b && b < c){
      mem[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
      return mem[a][b][c];
      
    } else {
      mem[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
      return mem[a][b][c];
      //return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.printf("%d\n", w(1, 1, 1));
    while(true){
      String s = br.readLine();
      String[] i = s.split(" ");
      int a,b,c;
      a = Integer.parseInt(i[0]);
      b = Integer.parseInt(i[1]);
      c = Integer.parseInt(i[2]);
      if (a == -1 && b == -1 && c == -1){
        break;
      }

      System.out.printf("w(%d, %d, %d) = %d \n",a, b, c, w(a, b, c));
    }
    
  }
}
