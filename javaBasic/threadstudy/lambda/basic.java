package javaBasic.threadstudy.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class basic {
    static public void main(String... args){
        int [] arr = new int[5];

        Arrays.setAll(arr, (i)->(int)(Math.random()*5));
        System.out.println(Arrays.toString(arr));

        Myfunction f = (a, b) -> a > b ? a:b; // abstract method 를 람다식으로 직접정의함
        int big = f.max(5,3);

        Predicate<String> isEmpty = s-> s.length() >=0;
        Predicate<String> isEmpty2 = s-> s.length() < 10;
        String s = "4";

        if (isEmpty.and(isEmpty2).test(s)){
            System.out.println("this is empty");
        }

        LambdaCollection.collectionTest();
        StreamTest.streamTest();


    }
}

@FunctionalInterface
interface Myfunction {
    int max(int a, int b);
}

class LambdaCollection {
    public static void collectionTest(){
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<10; i++){
            list.add(i);
        }
        Map<String, Integer> map= new HashMap<>();
        for(int i = 0; i< 10; i++){
            String key = Integer.toString(i*2);

            map.put(key, i);
        }


        System.out.print("lit foreach: ");
        list.forEach(i->System.out.print(" " + i));
        System.out.println();

        list.replaceAll(t -> t*10);
        System.out.print("lit replace all: ");
        System.out.println(Arrays.toString(list.toArray()));

        list.removeIf(t-> t==10);
        System.out.print("Remove: ");
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(map.toString());
        map.compute("0", (k, v)-> 4);
        System.out.println(map.toString());

        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (s) -> Integer.toBinaryString(s);
        Function<String, String> h = f.andThen(g);

        System.out.println(h.apply("FF"));


    }
}

class StreamTest {
    public static void streamTest(){
        System.out.println("======================");
        System.out.println("==========StreamTest==");
        System.out.println("======================");
        Stream<String> stream = Stream.of(new String[]{"a", "b", "c"});
        IntStream.rangeClosed(0, 5).forEach(System.out::print);
        System.out.println();
        IntConsumer funcPrint = s-> System.out.print(" " + s);


        new Random().ints(0, 10).limit(10).forEach(funcPrint);
        System.out.println();

        Stream<Integer> eventStream = Stream.iterate(0, n->n+2);// 무한 스트림
        eventStream.limit(5).forEach(s->System.out.println("  " + s));

        IntStream a = IntStream.rangeClosed(0, 10);
        a.skip(3).forEach(funcPrint);
        System.out.println();

        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();

        strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        strStream.sorted((s1, s2)-> s1.compareTo(s2)).forEach(s->System.out.print(s + " "));
        System.out.println();

        Map<String, String[]> phoneBook = new HashMap<>();
        phoneBook.put("Kim Jonhee", new String [] {"010-0000-0000", "010-0000-0001"});
        phoneBook.put("Park Nare", new String [] {"010-0000-0002", "010-0000-0003"});
        phoneBook.put("Hong inpyo", new String [] {"010-0000-0002"});
        phoneBook.put("Hong suaha", new String [] {"010-0000-0007"});
        phoneBook.put("Hong sunkyung", new String [] {"010-0000-0002"});
        phoneBook.put("Jin Young", new String [] {"010-0034-0002"});

        Stream.of(phoneBook.keySet()).flatMap(k->k.stream()).forEach(s->System.out.println(s));

        Stream<String> keyStream = phoneBook.keySet().stream();
        keyStream.forEach(s->System.out.print(s + "/"));
        System.out.println();

        keyStream = phoneBook.keySet().stream();
        keyStream.sorted(String::compareTo).forEach(s->System.out.print(s + "/"));
        System.out.println();

        keyStream = phoneBook.keySet().stream();
        keyStream.sorted(String::compareTo).map(String::toLowerCase).forEach(s->System.out.print(s + "/"));
        System.out.println();

//        Stream.of(phoneBook).map(m->m.keySet()).

        String [] lineArr = {
                "power over whelming",
                "show me the money"
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        //Stream<String[]> strArrStream = lineStream.map(line->Stream.of(line.split(" +")));
        Stream<String> strArrStream = lineStream.flatMap(line->Stream.of(line.split(" +")));
        //strArrStream.forEach();
        Optional<String> oString = Optional.of("dd");

    }
}

