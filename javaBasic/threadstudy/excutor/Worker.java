package javaBasic.threadstudy.excutor;

public class Worker implements Runnable{

    public Worker(int id, Job job) {
        this.id = id;
        this.job = job;
    }

    private int id;
    private Job job;

    public Worker() {

    }

    public void run() {

        int sum = this.job.getFirst() + this.job.getSecond();

        System.out.println("id : " + id + " = " + sum + " Thread Name: "+Thread.currentThread().getName());

    }
}
