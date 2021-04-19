
import java.util.*;
import java.io.*;


public class padoban {

  static int N;

  static long d[] = new long[103];

  static void padoban(int N){
		d[0] = 1; d[1] = 1; d[2] = 1;
		for(int i=3;i<N;i++){
        d[i] = d[i-3] + d[i-2];
    }
		System.out.println(d[N-1]);




  }

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.printf("%d\n", w(1, 1, 1));
    
      int n = Integer.parseInt(br.readLine());
      for (int i=0; i<n; i++){
        N = Integer.parseInt(br.readLine());
        padoban(N);
      }    
  }

}
