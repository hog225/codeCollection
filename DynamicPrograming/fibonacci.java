
import java.util.*;
import java.io.*;
//Main
public class fibonacci {
  static List<Integer> fifunc = new ArrayList<Integer>();
  static int c0 =0;
  static int c1 =0;


  static int fibo(int N){
    if (N == 0){
      //System.out.println("0");
      c0++;
      return 0;
    }
    else if (N == 1){
      //System.out.println("0");
      c1++;
      return 1;
    }
    else{
      return fibo(N-2) + fibo(N-1);
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println(fibo(3));
    System.out.printf("%d, %d \n",c0, c1);
  }
}
