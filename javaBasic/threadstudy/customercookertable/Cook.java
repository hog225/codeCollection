package javaBasic.threadstudy.customercookertable;

import java.util.Random;

public class Cook implements Runnable{
    private Table table;
    private String threadName;

    Cook(Table table){
        this.table = table;
        this.threadName = Thread.currentThread().getName();

    }

    @Override
    public void run(){
        while (true){
            Random random = new Random();

            int idx = random.nextInt(table.dishNum());
            table.add(table.dishNames[idx]);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println(threadName + "INTERRUPTED");
            }
        }
    }
}
