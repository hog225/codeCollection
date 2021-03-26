import java.util.*;
import java.io.*;
public class APlusB{
	public static void main(String args[]) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
        String[] s = br.readLine().split(" ");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
		System.out.println(a+b);
        
	}
}