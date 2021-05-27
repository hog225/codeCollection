
import java.util.*;
import java.io.*;

public class climing {
    static int N;
    static int in[] = new int[301];
    static int re[] = new int[301];
    static int maxval; 

    //재귀 
    static void clime(){
        re[0] = in[0];
        re[1] = Math.max(in[1] + in[0], in[1]);
        re[2] = in[2] + Math.max(in[0], in[1]);
        for (int i =3; i< N; i++){
            int s1 = in[i-1] + re[i-3];
            int s2 = re[i-2];
            re[i] = in[i] + Math.max(s1, s2);

        }
        System.out.println(re[N-1]);

    }
  
    public static void main(String[] args) throws Exception {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // System.out.printf("%d\n", w(1, 1, 1));
      
        N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
          in[i] = Integer.parseInt(br.readLine());
        }    
        clime();
    }
}