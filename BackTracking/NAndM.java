package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NAndM {
    static int M;
    static int [] checked = null;
    static int [] sol = null;
    public static void printCase(int N, int index){

        if (index == M){
            for (int i =0; i<M; i++){
                System.out.print(sol[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i=0; i<N; i++){
            if (checked[i] == 0){
                sol[index] = i+1;
                checked[i] = 1;
                printCase(N, index + 1);
                checked[i] = 0;
            }
        }

    }

    public static void main(String [] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = in.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        checked = new int[N];
        sol = new int[N];
        printCase(N, 0);



    }
}
