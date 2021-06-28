package javaBasic.threadstudy.customercookertable;

import java.util.ArrayList;
import java.util.List;

public class Table {
    String[] dishNames = {"도넛", "도넛", "김치찌개"};
    final int MAX_FOOD = 6;

    private List<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){ // 해당 객체가 락이  걸림
        if (dishes.size() >= MAX_FOOD)
            return;
        dishes.add(dish);
        System.out.println("Dishes:" + dishes.toString());

    }

    public boolean remove(String dishName){
        synchronized(this){ // 해당 객체가 락이 걸림
            while (dishes.size() == 0){
                String name = Thread.currentThread().getName();
                System.out.println(name + " 기다리는 중 ......");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    System.out.println(name + "Interrupted");
                }
            }

            for (int i=0; i<dishes.size(); i++){
                if (dishName.equals(dishes.get(i))){
                    dishes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int dishNum(){
        return dishNames.length;
    }

}
