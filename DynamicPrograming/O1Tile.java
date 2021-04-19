
import java.util.*;
import java.io.*;


public class O1Tile {

  static int N;
  // static int dat[];
  // static int cache[][] = new int[10][10];
  static int d[] = new int[1000001];
  // static int tileAllCase(int N){
  //   int count = 0;
  //   int res = 0;
  //   for (int i=0; i<=N; i=i+2){
  //     int newN = N - (i/2);
  //     res = tile(newN, i/2, true);
  //     System.out.println(cache[i/2][i/2]);
  //   }
  //   return count;
  // }

  // static int tile(int N, int zN, boolean s){

  
  //   if ((cache[N][zN] != 0)){ //|| (cache[N][Math.abs(N-zN)] != 0)){
      
  //     return cache[N][zN];
  //   }

  //   if (N == 0 || zN == 0 || zN == N){
  //     cache[N][zN] = 1;
  //     cache[0][0] = 1;
  //     //cache[N][Math.abs(N-zN)] = 1;
      

  //     return 1;
  //   }
  //   else {
  //     cache[N][zN] = N * tile(N - 1, zN-1, false);
  //     //cache[N][Math.abs(N-zN)] = cache[N][zN];
      
  //     int d = zN * tile(zN - 1 ,zN -1, false);
  //     return cache[N][zN];
  //   }
    
    
  // }
  // // 0 과 1을 나열 하는 경우의 수 
  // static void tileP(int N, int zN, int oN, int idx){
    
  //   if (idx == N){
  //     for (int i: dat){
  //       System.out.print(i);
  //     }
  //     System.out.println();
      
  //   } else {
  //     if (zN > 0){
  //       dat[idx] = 0;
  //       tileP(N, zN -1, oN, idx+1);
  //     } 
  //     if (oN > 0){
  //       dat[idx] = 1;
  //       tileP(N, zN, oN - 1, idx+1);
  //     }
  //   }
  // }

  static void tile(int N){
		d[0] = 0; d[1] = 1; d[2] = 2;
		for(int i=3;i<=N;i++){
            d[i] = d[i-2] + d[i-1];
            d[i]%=15746;
        }
		System.out.println(d[N]);




  }

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.printf("%d\n", w(1, 1, 1));
    
      String s = br.readLine();
      N = Integer.parseInt(s);
      // dat = new int[N];

      tile(N);


      // dat = new int[3];
      // tileP(N,1, N - 1, 0);

      
    
    
  }

}
