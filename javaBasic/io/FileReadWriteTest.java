package javaBasic.io;

import java.io.*;

public class FileReadWriteTest {
    public static void main(String ...arg){
        try {
            long start = System.currentTimeMillis();
            String path = new File("").getAbsolutePath();
            String fileName = "file_test.txt";
            StringBuilder strb = new StringBuilder();
            strb.append(path + "\\");
            strb.append("javaBasic" + "\\");
            strb.append("io" + "\\");
            strb.append(fileName);
            fileName = strb.toString();

            int ch;
            FileInputStream stream = new FileInputStream(fileName);
            FileReader reader = new FileReader(fileName);

            while ((ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            while ((ch = stream.read()) != -1){
                System.out.print((char)ch);
            }

            stream.close();
            reader.close();
            long end = System.currentTimeMillis();
            System.out.println("실행시간 : " + (end - start)/1000.0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
