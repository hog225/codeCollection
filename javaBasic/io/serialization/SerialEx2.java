package javaBasic.io.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialEx2 {
    public static void main(String ...args) throws Exception{
        String fileName = "UserInfo.ser";
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fos = new FileInputStream(fileName);
        BufferedInputStream bos = new BufferedInputStream(fos);

        ObjectInputStream in = new ObjectInputStream(bos);

        System.out.println((UserInfo)in.readObject());
        System.out.println((UserInfo)in.readObject());
        System.out.println((List)in.readObject());

        System.out.println("Reverse Serialization OVER");
    }
}
