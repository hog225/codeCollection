package javaBasic.threadstudy.excutor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolService {
    private ExecutorService executorService;

    public ThreadPoolService() {
        this.executorService = Executors.newFixedThreadPool(4);
    }

    public void start(){
        // Start work with ExecutorService

        int sq = 0;
        while(true){

            Random random = new Random();

            Job job = new Job();
            job.setFirst(random.nextInt());
            job.setSecond(random.nextInt());


            Worker worker = new Worker(sq, job);


            executorService.submit(worker);

            sq++;


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        ThreadPoolService threadPoolService = new ThreadPoolService();
        threadPoolService.start();
        System.out.println("END MAIN");
    }
}
