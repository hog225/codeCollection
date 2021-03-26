import java.util.*;
import java.io.*;
//Main
public class blackJack {
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] s = br.readLine().split(" ");
    String[] x = br.readLine().split(" ");

    int cardCount = Integer.parseInt(s[0]);
    int dealerNumber = Integer.parseInt(s[1]);
    ArrayList<Integer> cardNumber = new ArrayList<Integer>();
    ArrayList<Integer> resultNumber = new ArrayList<Integer>();
    for (int i=0; i< x.length; i++){
      cardNumber.add(Integer.parseInt(x[i]));
    }
    int result = search(cardNumber, cardCount, dealerNumber);
		System.out.println(result);
    // for (int i=0; i<cardCount-2; i++){
    //   for (int j=i+1; j<cardCount-1; j++){        
    //     for (int k=j+1; k<cardCount; k++){
    //         int num = cardNumber.get(i) + cardNumber.get(j) + cardNumber.get(k);
    //         resultNumber.add(num);

    //       }
    //   }
    // }
    // ArrayList<Integer> subNumber = new ArrayList<Integer>();
    // for (int number: resultNumber){
    //   subNumber.add(Math.abs(number-dealerNumber));
    // }
    // int minindex = subNumber.indexOf(Collections.min(subNumber));
    // int result = resultNumber.get(minindex);
    // System.out.println(result);
  
    
  
  }
  static int search(ArrayList<Integer> arr, int N, int M) {
    int result = 0;
    
    for(int i = 0; i < N-2; i++) {
      for(int j = i + 1; j< N -1 ; j++) {
        for(int k =j + 1; k< N ; k++) {
          
          int temp = arr.get(i) + arr.get(j) + arr.get(k);
          
          if(M == temp) {
            return temp;
          }
          
          if(result < temp && temp < M) {
            result = temp;
          }
        }
      }
    }
    return result;
  }
}
