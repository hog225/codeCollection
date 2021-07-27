package javaBasic.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedReaderWriterTest {
    public static void main(String ...args){
        try{
            System.out.println(new File(".").getCanonicalPath());
            long start = System.currentTimeMillis();
            String path = new File("").getAbsolutePath();
            String fileName = "file_test.txt";
            StringBuilder strb = new StringBuilder();
            strb.append(path + "\\");
            strb.append("javaBasic" + "\\");
            strb.append("io" + "\\");
            strb.append(fileName);
            fileName = strb.toString();

            FileReader f_reader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(f_reader);
            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
            long end = System.currentTimeMillis();
            System.out.println("실행시간 : " + (end - start)/1000.0);

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
