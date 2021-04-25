package DynamicPrograming;
import java.util.*;
import java.io.*;

public class climing {
    static int N;
    static int d[] = new int[301];
    static int t[] = new int[301];
    static int maxval; 

    //재귀 
    static void clime(int n, int sum, int step, int idx){
        
        if (n == N-1){
            if (sum >= maxval){
                maxval = sum;
            }
            t[idx] = n;
            System.out.print(" "+ t[0] + " "+ t[1] + " "+ t[2] + " "+ t[3] + " "+ t[3]);
            System.out.println("");
            // return sum;
        } else {
            
            for (int i=0; i< 2; i++){
                if (n == 0){
                    n = i;
                    step =2;
                    System.out.println("eeeeeeee");
                }
                    
                t[idx] = n;
                if (((N-1) - n) == 2){
                    clime(n+2, sum, 2, ++idx);
                } else if (((N-1)-n) == 1){
                    clime(n+1, sum, 1, ++idx);
                } else if (step == 1){
                    clime(n+2, sum, 2, ++idx);
                } else if (step == 2){
                    
                    clime(n+1, sum, 1, ++idx);
                    clime(n+2, sum, 2, ++idx);
                } else {
                    clime(n+1, sum, 1, ++idx);
                }
            }

        }
    }
  
    public static void main(String[] args) throws Exception {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // System.out.printf("%d\n", w(1, 1, 1));
      
        N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
          d[i] = Integer.parseInt(br.readLine());
        }    
        System.out.println(N);
        clime(0, 0, 0, 0);
    }
}