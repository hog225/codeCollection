
import java.util.*;
import java.io.*;

//https://m.blog.naver.com/occidere/220785383050 

// 4
// 60 40 83
// 49 26 57
// 89 13 99
// 123 777 999

// 2
// 60 40 83
// 123 777 999

// 3
// 1 9 2
// 1 9 9
// 9 1 9


public class RGBDistance {

  static int N;
  static int rgb;
  static int val;
  static int minVal=0;
  // static int d[] = new int[1001];
  static int input[][] = new int[1001][3];
  static int result[][] = new int[1001][3];

  // 재귀로는 못할듯 
  // static void RGBd(int idx, int N, boolean s){
  //   if (idx == N){
  //     System.out.println(d[0] + "  " + d[1] +  "  "+d[2]);
  //   } else {
  //     //String rgb[] = input[idx].split(" ");
  //     for (int i=0; i<3; i++){
  //       if (s==true || (d[idx-1] != i)){
  //         d[idx] = i;
  //         RGBd(idx+1, N, false);
  //       } 
  //     }
  //   }

  // }

  // 아래와 같이 하면 답을 구할 수 없다. 
  // static void RGBd(){
  //   for (int i=0; i<3; i++){
  //     val = 0;
  //     for (int j=0; j<N; j++){
  //       if (j == 0){
  //         rgb = i;
  //         val += input[j][rgb];
          
  //       } else {
  //         int min = 1001;
  //         int idx = 0;
  //         for (int k=0; k<3; k++){  
  //           if ((rgb != k) && (input[j][k] < min)){
  //             min = input[j][k];
  //             idx = k;
  //           }
  //         }
  //         rgb = idx;
  //         val += input[j][rgb];
  //       }
  //       System.out.print(rgb);
  //     }
  //     System.out.println("--" + val);
      
      
  //     if (minVal==0 || val < minVal){
  //       minVal = val;
  //     }
  //   }
  //   System.out.println(minVal);
  // }

  static void RGBd(){
    result[0][0] = 0;
    result[0][1] = 0;
    result[0][2] = 0;
    for (int i =1; i<= N; i++){
      result[i][0] = Math.min(result[i-1][1], result[i-1][2]) + input[i-1][0];
      result[i][1] = Math.min(result[i-1][0], result[i-1][2]) + input[i-1][1];
      result[i][2] = Math.min(result[i-1][0], result[i-1][1]) + input[i-1][2];
    }

    int val = 0;
    for (int i=0; i< 3; i++){
      val = result[N][i];
      if (minVal == 0 || val < minVal){
        minVal = val;
      }

    }
    System.out.println(minVal);
  }



  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.printf("%d\n", w(1, 1, 1));
    
      N = Integer.parseInt(br.readLine());
      for (int i=0; i<N; i++){
        String in = br.readLine();
        String inrgb[] = in.split(" ");
        for (int j=0; j<3; j++){
          input[i][j] = Integer.parseInt(inrgb[j]);
        }
        
      }    
      
      //System.out.println(k);
      RGBd();
  }

}
