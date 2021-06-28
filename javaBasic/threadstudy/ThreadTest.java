package javaBasic.threadstudy.excutor;

public class ThreadTest {
    public static void main(String... args) throws Exception{

        Thread th1 = new thread1();
        Thread th2 = new Thread(new thread2());

        System.out.println(th1.getState());
        th1.start();
        th2.start();
        System.out.println(th1.getState());
    }


}

class thread1 extends Thread{
    public void run(){
        for (int i =0; i< 10; i++){
            System.out.println("thread1 + " + i);
        }
    }

}


class thread2 implements Runnable{

    @Override
    public void run() {
        for (int i =0; i< 10; i++){
            System.out.println("thread2 + RUNNABLE " + i + Thread.currentThread().getName());
        }

    }

}