
import java.util.*;
import java.io.*;
// 백준 1932
public class IntegerTriangle {

  static int N;
  static int maxVal=0;
  static int input[][] = new int[501][10000];
  static int result[][] = new int[501][10000];

  static void tri(){
    result[0][0] = 0;
    for (int i=1; i <= N; i++){
      for (int j=0; j<i; j++){
        if (j == 0){
          result[i][j] = result[i-1][j] + input[i-1][j];
        } else if (j == i-1){
          result[i][j] = result[i-1][j-1] + input[i-1][j];
        } else {
          result[i][j] = Math.max(result[i-1][j-1], result[i-1][j]) + input[i-1][j];
        }
      }
    }
    for (int i=0; i<N; i++){
      if (result[N][i] >= maxVal){
        maxVal = result[N][i];
      }
    }
    System.out.println(maxVal);
  }



  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.printf("%d\n", w(1, 1, 1));
    
      N = Integer.parseInt(br.readLine());
      for (int i=0; i<N; i++){
        String in = br.readLine();
        String inval[] = in.split(" ");
        for (int j=0; j<inval.length; j++){
          input[i][j] = Integer.parseInt(inval[j]);
        }
        
      }    
      
      //System.out.println(k);
      tri();
  }

}
