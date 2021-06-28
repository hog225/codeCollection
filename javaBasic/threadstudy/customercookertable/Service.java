package javaBasic.threadstudy.customercookertable;

import java.util.Random;


public class Service {
    public static void main(String... args){
        Table table = new Table();
        String[] dishNames = {"도넛", "도넛", "김치찌개"};

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, dishNames[0]), "CUST1").start();
        new Thread(new Customer(table, dishNames[1]), "CUST2").start();

    }
}
