import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class chaos2 {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        

        for(int i = 0 ; i < q.length ; i ++) {

             if(q[i]-(i+1)>2) {

                 System.out.println("Too chaotic");

                 return;

             }

        }

        

        int count = 0;

        

        for(int i = 0 ; i < q.length ; i ++) {
            if(i+1 != q[i]) {
                int tmpS = i+1; 
                System.out.printf("{%d}\n",tmpS);
                for(int j = i+1; j< q.length ; j++) {
                    if(q[j] == tmpS) {
                        System.out.printf("{%d}{%d}\n",q[j], q[j-1]);
                        int tmp = q[j-1];
                        q[j-1] = q[j];
                        q[j] = tmp;
                        
                        count += 1;
                        i--;
                        j = q.length;
                    }
                }
            }

        }

        

        System.out.println(count);





    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
