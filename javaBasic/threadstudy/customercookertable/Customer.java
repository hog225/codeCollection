package javaBasic.threadstudy.customercookertable;

public class Customer implements Runnable{
    private Table table;
    private String food;

    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    public void run(){
        while (true) {
            String name = Thread.currentThread().getName();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                System.out.println(name + "interrupted");
            }

            if (eatFood())
                System.out.println(name + " 가 " + food + "를 먹음");
            else
                System.out.println(name + " 먹는데 실패");
        }
    }

    private boolean eatFood() {
        return table.remove(food);
    }
}
