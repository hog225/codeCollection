package javaBasic.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;

public class FileTest {
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

            File f = new File(fileName);
            URI uris = f.toURI();
            System.out.println(uris.toString());
            System.out.println(f.canRead());
            System.out.println(System.getProperty("java.io.tmpdir"));



        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
